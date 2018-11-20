package demo2.plain_java;

class Alpha {

    int ns;
    static int s;

    Alpha(int ns) {
        if (s < ns) {
            s = ns;
            this.ns = ns;
        }
    }

    void doPrint() {
        System.out.println("ns = " + ns + " s = " + s);
    }
}

public class Question40_Alpha {

    public static void main(String[] args) {
        Alpha ref1 = new Alpha(50);
        Alpha ref2 = new Alpha(125);
        Alpha ref3 = new Alpha(100);

        ref1.doPrint();
        ref2.doPrint();
        ref3.doPrint();
    }
}

//    ns = 50 s = 125
//    ns = 125 s = 125
//    ns = 0 s = 125
// oti s e static a 125 e najgolemo, i ns se printa prvo