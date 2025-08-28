class Heart {
    int beatCount;

    Heart(int beatCount) {
        this.beatCount = beatCount;
    }

    void beating() {
        System.out.println("Heart is beating with count: " + this.beatCount);
    }
}

class Human {
    String name;
    int age;
    Heart heart;

    Human(String name, int age, int count) {
        this.name = name;
        this.age = age;
        this.heart = new Heart(count);
    }

    void alive() {
        this.heart.beating();
        System.out.println("Human is alive...");
    }
}

class CompositionExample {
    public static void main(String[] args) {
        Human h1 = new Human("Priya", 20, 72);
        Human h2 = new Human("Arjun", 21, 75);

        h1.alive();
        h2.alive();
    }
}
