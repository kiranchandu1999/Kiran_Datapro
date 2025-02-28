interface Parent1 {
    void print();
}

interface Parent2 {
    void print();
}

class Child implements Parent1, Parent2 {
    void display() {
        System.out.println("displaying from child");
    }

    public void print() {
        System.out.println("printing child...");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Child ch1 = new Child();
        ch1.display();
        ch1.print();
    }
}
