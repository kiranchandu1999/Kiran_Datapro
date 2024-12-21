class Vehicle {
    // properties
    int vhNum;
    String brand;
    String color;
    
    // // default
    Vehicle(){

    }

    // constructor
    Vehicle(int vhNum, String brand, String color){
        this.vhNum = vhNum;
        this.brand = brand;
        this.color = color;
    }

    void drive(){
        System.out.println("vehicle driving...");
    }

    void stop(){
        System.out.println("vehicle break....");
    }

    int add(int a, int b){
        return a + b;
    }

    void printAddress(){
        System.out.println(this);
    }
}

public class VehicleExample {
    public static void main (String[] args) {
        Vehicle vh1 = new Vehicle(3568, "Tata", "black");

        Vehicle vh2 = new Vehicle(7892, "Suzuki", "white");
        
        Vehicle vh3 = new Vehicle();
        vh3.vhNum = 2546;

        vh1.add(5, 6);
        vh2.add(15, 8);

        vh1.printAddress();
        vh2.printAddress();

        System.out.println(vh1);
    }
}