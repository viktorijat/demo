package demo2.garbage_collection;

class Student {
    String name;
    int age;
}

public class StudentTest {

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        s1 = s3;
        s3 = s2;
        s2 = null; // line 11

        // After line 11, one object is eligible for garbage collection
    }
}
