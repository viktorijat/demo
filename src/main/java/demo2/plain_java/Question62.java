package demo2.plain_java;

class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class Question62 {

    public static void main(String[] args) {
        Student[] students = new Student[3];
        System.out.println(students.length);
        students[1] = new Student("Richard");
        students[2] = new Student("Donald");

        for (Student s : students) {
            System.out.print(" " + s.name);
        }
    }
}
