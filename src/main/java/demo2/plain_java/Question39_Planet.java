package demo2.plain_java;

public class Question39_Planet {

    public String name;
    public int moons;

    public Question39_Planet(String name, int moons) {
        this.name = name;
        this.moons = moons;
    }

    public static void main(String[] args) {

        Question39_Planet[] planets = {
                new Question39_Planet("Mercury", 0),
                new Question39_Planet("Venus", 0),
                new Question39_Planet("Earth", 1),
                new Question39_Planet("Mars", 2),
        };

        System.out.println(planets);
        System.out.println(planets[2]);
        System.out.println(planets[2].moons);
    }
}

// [Ldemo2.plain_java.Question39_Planet;@54bedef2
// demo2.plain_java.Question39_Planet@5caf905d
// 1
