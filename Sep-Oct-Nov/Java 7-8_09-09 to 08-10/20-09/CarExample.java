class Car {
    // variables
    int number;
    String brand;
    String color;

    // constructor
    Car(int number, String brand, String color) {
        this.number = number;
        this.brand = brand;
        this.color = color;
    }

    Car() {
        System.out.println("hii");
    }

    // methods
    // method-return-type method-name (paramaters) {
    //     method body
    // }

    // set the variable values
    void setValues(int n, String b, String c) {
        number = n;
        brand = b;
        color = c;
    }

    int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    String getCarColor() {
        return "My car color is " + color;
    }
    
    void drive() {
        System.out.println("driving...");
    }
}

public class CarExample {
    public static void main(String[] args) {
        // object creation
        Car car1 = new Car(101, "Suzuki", "black");
        // car1.number = 101;
        // car1.brand = "Suzuki";
        // car1.color = "black";
        // car1.setValues();
        System.out.println(car1);

        Car car2 = new Car();
        car1.number = 205;
        car2.brand = "Tata";
        car2.color = "white";

        car1.add(5, 8);
        System.out.println(car1.getCarColor());
        System.out.println(car2.getCarColor());

        car1.drive();
    }
}