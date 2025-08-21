// blueprint
class Car {
    // properties or attributes
    String color;
    String brand;
    int speedLimit;
}

class ClassAndObject {
    public static void main(String[] args) {
        // car objects creation
        Car car1 = new Car();
        System.out.println(car1);
        // accessing car1 values
        car1.brand = "Tata";
        car1.color = "white";
        car1.speedLimit = 150;
        System.out.println(car1.brand); // Tata
        System.out.println(car1.color); // white

        // let's create another car object
        Car car2 = new Car();
        car2.color = "black";
        car2.brand = "Suzuki";
        car2.speedLimit = 120;
        System.out.println(car2);
        System.out.println(car2.speedLimit); // 120
    }
}
