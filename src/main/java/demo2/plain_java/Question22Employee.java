package demo2.plain_java;

public class Question22Employee {

    String name;
    boolean contract;
    double salary;

    Question22Employee() {
        //line n1
        this.name = new String("Joe");
        this.contract = new Boolean(true);
        this.salary = new Double(100);
    }

    public String toString() {
        return name + ":" + contract + ":" + salary;
    }

    public static void main(String[] args) {
        Question22Employee e = new Question22Employee();

        //line n2
        e.name = "Joe";
        e.contract = true;
        e.salary = 100.0;

        System.out.println(e);

        // Joe:true:100.0
    }
}
