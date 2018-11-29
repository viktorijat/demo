package demo2.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Question136 {



    private static void populate() throws SQLException {
        String url = "jdbc:derby:question136;create=true";
        Connection conn = DriverManager.getConnection(url);

        Statement stmt = conn.createStatement();

        stmt.executeUpdate("CREATE TABLE item4 ("
                        + "ID INTEGER PRIMARY KEY, "
                        + "DESCRIP VARCHAR(100),"
                        + "PRICE REAL,"
                        + "QUANTITY INTEGER"
                + ")" );

        stmt.executeUpdate("INSERT INTO item4 VALUES (1, 'description123', 10.0, 5)");
        stmt.executeUpdate("INSERT INTO item4 VALUES (110, 'dfgrewght', 8.0, 6)");

        stmt.close();
        conn.close();
    }

    private static void select() {

        String url = "jdbc:derby:question136;create=true";

        try {
            Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from item4 where id=110");


            while (rs.next()) {
                System.out.println("ID: " + rs.getDouble("Id"));
                System.out.println("Description: " + rs.getString("Descrip"));
                System.out.println("Price: " + rs.getDouble("Price"));
                System.out.println("Quantity: " + rs.getInt("Quantity"));
            }
        } catch (SQLException se) {
            System.out.println("Error");
        }
    }

    public static void main(String[] args) throws SQLException {
        //populate();
        select();
    }




}
