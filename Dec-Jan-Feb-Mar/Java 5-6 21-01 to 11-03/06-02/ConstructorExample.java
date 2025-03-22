class Animal {
    String name;
    String breed;
    int numOfLegs;

    // constructor
    Animal(String name, String breed, int numOfLegs) {
        this.name = name;
        this.breed = breed;
        this.numOfLegs = numOfLegs;
    }
}

public class ConstructorExample {
    public static void main(String[] args) {
        Animal a1 = new Animal("tommy", "dog", 4);
        // a1.name = "tommy";
        // a1.breed = "dog";
        // a1.numOfLegs = 4;

        Animal a2 = new Animal("jimmy", "dog", 3);

        System.out.println(a1.name);

        System.out.println(a2.breed);
    }
}
