class Vehicle {
    // properties
    int vhNum;
    String brand;
    String color;
    static int wheels = 4;

    // constructor
    // Vehicle(int num, String br, String clr){
    //     vhNum = num;
    //     brand = br;
    //     color = clr;
    // }

    Vehicle(int vhNum, String brand, String color){
        this.vhNum = vhNum;
        this.brand = brand;
        this.color = color;
    }

    // methods
    // void assigning(int num, String br, String clr){
    //     vhNum = num;
    //     brand = br;
    //     color = clr;
    // }

    void drive(){
        System.out.println(this.color);
    }

    static void stop(){
        System.out.println("vehicle break....");
        // this.drive();
    }

    int add(int a, int b){
        return a + b;
    }
}

public class VehicleExample2 {
    public static void main (String[] args) {
        Vehicle vh1 = new Vehicle(101, "suzuki", "black");
        // vh1.assigning(101, "suzuki", "black");

        Vehicle vh2 = new Vehicle(102, "BMW", "white");
        // vh2.assigning(102, "BMW", "white");
        vh1.drive();

        Vehicle.stop();
        // int val = vh2.add(5, 3);
        
        System.out.println(Vehicle.wheels);
    }
}