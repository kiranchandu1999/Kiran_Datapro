class Heart {
    int beatCount;

    Heart(int beatCount) {
        this.beatCount = beatCount;
    }

    void beat() {
        System.out.println("Heart beating..");
    }
}

class Human {
    String name;
    Heart heart;
    // Composition
    Human(String name) {
        this.name = name;
        // Heart will be created inside human
        this.heart = new Heart(72);
    }

    void alive() {
        this.heart.beat();
        System.out.println("Human is alive..");
    }
}

public class Composition {
    public static void main(String[] args) {
        Human h1 = new Human("David");
        h1.alive();
    }
}
