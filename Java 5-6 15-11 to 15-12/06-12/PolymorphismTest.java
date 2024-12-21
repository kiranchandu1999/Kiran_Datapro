public class PolymorphismTest {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        int sum1 = p1.add(5, 3);
        System.out.println(sum1);

        int sum2 = p1.add(5, 10, 15);
        System.out.println(sum2);

        double sum3 = p1.add(5.0, 6.5);

        Child c1 = new Child();
        int sum4 = c1.add(5, 2);
        System.out.println(sum4);
    }
}

class Parent {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

class Child extends Parent {
    int add(int a, int b) {
        return a + b + 3;
    }
}
