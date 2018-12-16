package exam3;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static Comparator<Person> COMPARATOR = new Comparator<Person>() {
        @Override
        public int compare(Person o1, Person o2) {
            return o1.age - o2.age;
        }
    };
}
public class Question85 {

    public static void main(String[] args) {
        Set<Person> list = new TreeSet<Person>(Person.COMPARATOR);
        list.add(new Person("John", 50));
        list.add(new Person("Frank", 15));
        list.add(new Person("Adam", 15));
        list.forEach(a -> System.out.println(a.toString()));
    }

}
