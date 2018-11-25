package demo2.plain_java;

public class Question80 {

    String name;
    int age = 25;

    public Question80(String name) {
        //this();                       // line n1
        this.name = name;
    }

    public Question80(String name, int age) {
        //Question88(name);             // line n2
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String show() {
        return name + " " + age;
    }

    public static void main(String[] args) {
        //Question88 p1 = new Question88("Jesse");
        //Question88 p2 = new Question88("Walter", 52);
        //System.out.println(p1.show());
        //System.out.println(p2.show());
    }
}
