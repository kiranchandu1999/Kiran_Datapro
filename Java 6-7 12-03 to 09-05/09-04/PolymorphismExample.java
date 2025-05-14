class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    long add(long a, int b) {
        return a + b;
    }
    
}

// runtime polymorphism
class MobileCalculator extends Calculator {
    double add(double a, double b) {
        System.out.println("Mobile calculator:");
        return a + b;
    }

    int add(int a, int b) {
        System.out.println("Mobile calculator add method");
        return a + b;
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        long res = c1.add(5, 10);
        System.out.println(res);

        System.out.println(c1.add(5, 10, 8));

        System.out.println("------Runtime polymorphism---------");
        MobileCalculator mc1 = new MobileCalculator();
        System.out.println(mc1.add(5.8, 6.2));
        System.out.println(mc1.add(20, 10));
    }
}
