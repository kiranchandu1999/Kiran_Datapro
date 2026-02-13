class Heart {
    int beatCount;

    Heart(int beatCount) {
        this.beatCount = beatCount;
    }

    void heartBeating() {
        System.out.println("Heart is beating with count: " + beatCount);
    }
}

class Human {
    String name;
    Heart heart;

    Human(String name, int cnt) {
        this.name = name;
        this.heart = new Heart(cnt);
    }

    void alive() {
        heart.heartBeating();
        System.out.println(name + " is alive...");
    }
}

public class CompositionExample {
    public static void main(String[] args) {
        // // creating heart
        // Heart ht1 = new Heart(72);
        // creating Human
        Human hm1 = new Human("Nikhil", 72);
        hm1.alive();
        Human hm2 = new Human("Kishore", 85);
        hm2.alive();
    }
}
