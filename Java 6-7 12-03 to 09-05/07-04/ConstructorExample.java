class Animal {
    String name;
    String color;

    // constructor
    Animal(String name, String color) {
        this.name = name;
        this.color = color;
        System.out.println(this);
    }

    // default
    Animal() {
        
    }

    void eat() {
        System.out.println(name + " eating...");
    }

}

class ConstructorExample {
    public static void main(String[] args) {
        Animal anim1 = new Animal("dog", "white");
        System.out.println(anim1);
        // anim1.name = "dog";
        // anim1.color = "white";
        anim1.eat();
        

        Animal anim2 = new Animal("cat", "black");
        // anim2.name = "cat";
        // anim2.color = "black";
        anim2.eat();
    }
}