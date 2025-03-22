class Car {
    // instance variables
    String carNumber; // variable declaration
    String color;
    String brand;

    // default constructor which will be created by JVM internally
    // Car() {
    // }

    // constructor
    Car(String cn, String cl, String br) {
        // constructor body
        carNumber = cn;
        color = cl;
        brand = br;
    }

    // methods
    void start() {
        System.out.println("car started");
    }

    // void assignValues(String cn, String cl, String br) {
    //     carNumber = cn;
    //     color = cl;
    //     brand = br;
    // }
}

class CarExample {
    public static void main(String[] args) {
        // local variable
        // int a;
        // System.out.println(a);

        // object creation
        Car c1 = new Car("1234", "black", "Tata");
        // values assigning
        // c1.carNumber = "1234";
        // c1.color = "black";
        // c1.brand = "Tata";

        // values assigning through method calling
        // c1.assignValues("1234", "black", "Tata");

        // value accessing
        System.out.println(c1.carNumber);
        System.out.println(c1.color);
        System.out.println(c1.brand);
        c1.start();

        // another car object
        // Car c2 = new Car();
        // c2.carNumber = "9874";
        // c2.color = "white";
        // c2.brand = "Toyota";
    }
}