package hackajob;

import com.google.gson.JsonArray;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class StarWarsSimplified {

    private static HttpURLConnection getConnection(String character) throws IOException {

        URL url = new URL("https://challenges.hackajob.co/swapi/api/people/?search=" + character);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-Type", "application/json; charset=utf-8");
        conn.setRequestProperty("Accept", "application/json; charset=utf-8");
        return conn;
    }

    private static String createResponseMessage(HttpURLConnection conn) throws IOException {

        BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line;
        StringBuilder result = new StringBuilder();
        while ((line = rd.readLine()) != null) {
            result.append(line);
        }
        rd.close();
        return result.toString();
    }

    private static JsonArray getFilms(String result) {
        return new JsonParser().parse(result).getAsJsonObject().getAsJsonArray("results").get(0)
                .getAsJsonObject().get("films").getAsJsonArray();
    }


    private static String sliceCharacterName(String character) {
        return character.split("\\s+")[0];
    }

    public static int run(String character) {

        String characterNameSliced = sliceCharacterName(character);
        String result = null;
        try {
            result = createResponseMessage(getConnection(characterNameSliced));
        } catch (IOException e) {
            System.out.println("Cannot find character: " + characterNameSliced);
        }
        JsonArray films = getFilms(result);
        return films.size();
    }

    public static void main(String[] args) {

        System.out.println(run("Luke Skywalker"));
    }

}
