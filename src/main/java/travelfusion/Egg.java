package travelfusion;

import java.util.concurrent.Callable;

interface Bird {

    Egg lay();
}

class Chicken implements Bird {

    int hatch = 0;

    public Chicken() {
    }

    public static void main(String[] args) {
        Chicken chicken = new Chicken();
        System.out.println(chicken instanceof Bird);
    }

    @Override
    public Egg lay() {
        if (this instanceof Chicken) {
            return new Egg(new Callable<Bird>() {
                @Override
                public Bird call() {
                    return new Chicken();
                }
            });
        } else {
            return null;
        }
    }
}

class Egg extends Chicken {

    //private int hatch = 0;

    public Egg(Callable<Bird> createBird) {

    }

    public Bird hatch() {

        Chicken chicken = new Chicken();
        Egg egg = new Egg(new Callable<Bird>() {
            @Override
            public Bird call() {
                return new Chicken();
            }
        });

        System.out.println(hatch);
        if (chicken.hatch == 2) {
            throw new IllegalStateException("Hatching an egg for the second time is not allowed");
        } else {
            chicken.hatch += 1;
        }

        return chicken;
    }
}
