package demo2.plain_java;

abstract class Question79 {

    int price;

//    public void printToy(); // nema ni abstract ni body, ne moze

    public static void insertToy() { }

    public int calculatePrice() {
        return price;
    }

//    public abstract Question79 getToy() { // ne moze da ima body ako e abstract!
//        return new Question79();
//    }

    public abstract int computeDiscount();
}
