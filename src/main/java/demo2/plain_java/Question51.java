package demo2.plain_java;

public class Question51 {

    void readCard(int cardNo) throws Exception {
        System.out.println("reading card");
    }

    void checkCard(int cardNo) throws RuntimeException { // line n1
        System.out.println("checking card");
    }

    public static void main(String[] args) {
        Question51 ex = new Question51();
        int cardNo = 12344;
        ex.checkCard(cardNo); // line n1
        // ex.readCard(cardNo); // line n2
        // line n2 compilation fails throws exception
    }
}
