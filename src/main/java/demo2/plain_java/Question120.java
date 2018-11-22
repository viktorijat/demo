package demo2.plain_java;

interface Drawable {
    public abstract void draw();
}

class Canvas implements Drawable {
    @Override
    public void draw() {

    }
    //public void draw() {}
}

abstract class Board extends Canvas {}

class Paper extends Canvas {
    protected void draw(int color) {}
}

class Frame extends Canvas implements Drawable {
    public void resize() {}
}

// all classes compile successfully

public class Question120 {


}