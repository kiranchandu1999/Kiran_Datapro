// blueprint
class Car {
    // attributes
    String brand;
    String modelName;
    String color;
    int speedLimit;

    // constructor
    Car(String brand, String modelName, String color, int speedLimit) {
        this.brand = brand;
        this.modelName = modelName;
        this.color = color;
        this.speedLimit = speedLimit;
    }

    // void assignValues(String b, String m, String c, int s) {
    //     brand = b;
    //     modelName = m;
    //     color = c;
    //     speedLimit = s;
    // }

    // methods
    void accelerate() {
        System.out.println(this.modelName + " car is accelerating at " + this.speedLimit + " kmph");
    }
}

class CarExample {
    public static void main(String[] args) {
        // create car object
        Car car1 = new Car("Toyota", "Innova", "black", 150);
        // assigning values to the car1 object
        // car1.assignValues("Toyota", "Innova", "black", 150);

        System.out.println(car1.color);
        car1.accelerate();

        // create another car object
        Car car2 = new Car("Toyota", "Fotuner", "white", 200);
        // car2.assignValues("Toyota", "Fotuner", "white", 200);

        System.out.println(car2.modelName);
        car2.accelerate();
    }
}
