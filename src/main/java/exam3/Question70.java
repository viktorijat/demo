package exam3;

interface I70 {
    int getValue();
}

enum Animal70 implements I70 {
    CAT(1);

    private int i;

    Animal70(int i) {
        this.i = i;
    }

    @Override
    public int getValue() {
        return i;
    }
}

enum AllAnimal70 implements I70 {
    CAT(Animal70.CAT), FISH(2);

    private int i;

    AllAnimal70(int i) {
        this.i = i;
    }

    AllAnimal70(Animal70 a) {
        this.i = a.getValue();
    }

    @Override
    public int getValue() {
        return i;
    }
}
public class Question70 {

    public static void main(String[] args) {
        System.out.println(Animal70.CAT);
        System.out.println(AllAnimal70.CAT);
        //System.out.println(Animal70.FISH);
    } // CAT CAT ako tretoto se prokomentira
}
