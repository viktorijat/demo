package demo2.plain_java;

class Customer {
    private String fName;
    private String iName;
    private static int count;

    public static int getCount() {
        return count;
    }

    public Customer(String fName, String iName) {
        this.fName = fName;
        this.iName = iName;
        ++count;
    }

    static {count = 0;}
}

public class Question135 {

    public static void main(String[] args) {
        Customer c1 = new Customer("Larry", "Smith");
        Customer c2 = new Customer("a", "b");
        Customer c3 = new Customer("c", "d");
        Customer c4 = new Customer("e", "f");
        c4 = null;
        c3 = c2;
        System.out.println(Customer.getCount());

        // 4
    }

}
