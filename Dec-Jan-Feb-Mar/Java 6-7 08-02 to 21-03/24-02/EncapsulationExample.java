import exmaple2.ProtectedAccessModifier;

class Animal {
    private String name;
    private int age;
    private String color;

    Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    void bark() {
        System.out.println("barking...");
    }

    // getters and setters
    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    void setAge(int age) {
        this.age = age;
    }

    int getAge() {
        return this.age;
    }

    void setColor(String color) {
        this.color = color;
    }

    String getColor() {
        return this.color;
    }
}

class ChildForProtected extends ProtectedAccessModifier {
    // String name = "";

    void printName() {
        System.out.println("parent class name variable value: " + super.name);
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        // animal objects
        Animal dog = new Animal("tommy", 10, "white");

        // dog.name = "puppy";
        dog.setName("puppy");

        // System.out.println(dog.color);
        System.out.println(dog.getColor());

        ChildForProtected c1 = new ChildForProtected();
        c1.printName();
    }
}
