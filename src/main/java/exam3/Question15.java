package exam3;

class Super {

    public String methodA() {
        return "SuperA";
    }

    public final String methodB() {
        return "SuperB";
    }
}

class Sub extends Super {

    public String methodA() {
        return "SubA";
    }

//    public String methodB() {
//        return "SubB"; // final e, ne moze override
//    }
}

public class Question15 {
}
