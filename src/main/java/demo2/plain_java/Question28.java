package demo2.plain_java;

public class Question28 {

    public static void main(String[] args) {
        int iVar = 100;
        float fVar = 100.100f;
        double dVar = 123;
        //iVar = fVar; // int -float
        fVar = iVar;
        dVar = fVar;
        //fVar = dVar; // float - double
        dVar = iVar;
        //iVar = dVar; // int -double
    }
}
