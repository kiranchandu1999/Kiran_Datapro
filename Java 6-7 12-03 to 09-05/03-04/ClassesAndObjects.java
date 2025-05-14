class Car {
    // variables
    String model;
    int carNumber;
    int speedLimit;

    // methods
    void accelerate(String speed) {
        System.out.println(model + " is accelerating at speed " + speed);
    }
}

class ClassesAndObjects {
    public static void main(String[] args) {
        // objects create
        int a = 10;

        Car c1 = new Car();

        System.out.println(a); // 10

        System.out.println(c1); // address of the object

        // assigning values to the c1 car object
        c1.carNumber = 1254;
        c1.model = "Innova";
        c1.speedLimit = 200;

        System.out.println(c1.carNumber);
        System.out.println(c1.model);
        System.out.println(c1.speedLimit);


        // another car object
        Car c2 = new Car();
        
        c2.model = "Baleno";
        c2.carNumber = 5892;
        c2.speedLimit = c1.speedLimit;

        System.out.println(c2.carNumber);
        System.out.println(c2.model);
        
        // calling accelerate method
        c1.accelerate("100 kmph");

        c2.accelerate("150 kmph");
    }
}