package demo2.interfaces;


interface Exportable {
    void export();
}

class Tool implements Exportable {

    public void export() {   // bese protected
        System.out.println("Tool::export");  // line n1 compiler error
    }
}

public class Question60 extends Tool implements Exportable {

    public void export() {                   // line n2
        System.out.println("RTool::export");
    }

    public static void main(String[] args) {
        Tool aTool = new Question60();
        Tool bTool = new Tool();

        callExport(aTool);
        callExport(bTool);
    }

    private static void callExport(Exportable ex) {
        ex.export();
    }


}
