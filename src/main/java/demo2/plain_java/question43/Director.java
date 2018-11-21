package demo2.plain_java.question43;

class Employee {
    public int salary;
}


class Manager extends Employee {
    public int budget;
}


public class Director {
    public int stockOptions;

    public static void main(String[] args) {
        Employee e = new Employee();
        Manager m = new Manager();
        Director d = new Director();

        // line n1

        e.salary = 50_000;
        m.budget = 1_000_000;

    }
}
