// blueprint for car objects
class Car {
    // attributes
    String brand;
    String color;
    int speed;

    // methods
}

class ClassAndObject {
    public static void main(String[] args) {
        // car objects creation
        Car c1 = new Car();
        c1.brand = "Toyota";
        c1.color = "black";
        c1.speed = 150;

        System.out.println(c1.color);
        System.out.println(c1.speed);

        // create some more objects with different data
    }
}