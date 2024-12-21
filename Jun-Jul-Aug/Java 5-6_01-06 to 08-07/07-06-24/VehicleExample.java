class Vehicle {
    // properties
    int vhNum;
    String brand;
    String color;

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
        System.out.println("vehicle driving...");
    }

    void stop(){
        System.out.println("vehicle break....");
    }

    int add(int a, int b){
        return a + b;
    }
}

public class VehicleExample {
    public static void main (String[] args) {
        Vehicle vh1 = new Vehicle(101, "suzuki", "black");
        // vh1.assigning(101, "suzuki", "black");

        Vehicle vh2 = new Vehicle(102, "BMW", "white");
        // vh2.assigning(102, "BMW", "white");

        System.out.println(vh2.color);
    }
}