package demo2;

public interface Animal {
    void walk();
}

abstract class Dog implements Animal {
    public void walk() {
        System.out.println("dog walk");
    }
}

class Shepard extends Dog implements Animal{

}


