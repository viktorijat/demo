package demo2.plain_java;


class VehicleQuestion38 {

    String type = "4W";
    int maxSpeed = 100;

    VehicleQuestion38(String type, int maxSpeed) {
        this.type = type;
        this.maxSpeed = maxSpeed;
    }
}

class CarQuestion38 extends VehicleQuestion38 {

    String trans;

//    CarQuestion38(String trans) { // line n1
//        this.trans = trans;
//    } // compilation fails on n1
//      // There is no default constructor available in 'demo2.plain_java.VehicleQuestion38'

    CarQuestion38(String type, int maxSpeed, String trans) {
        super(type, maxSpeed);
        //this(trans); // line n2 compilation fails

        // Call to 'this()' must be first statement in constructor body
    }


    public static void main(String[] args) {
        //CarQuestion38 c = new CarQuestion38("Auto");

    }

}
