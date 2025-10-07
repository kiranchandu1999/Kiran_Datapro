class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    // method overloading
    int add(int a, int b, int c) {
        return a+b+c;
    }

    // method overloading
    double add(double a, double b) {
        return a + b;
    }
}

class MethodOverloading {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        System.out.println(c1.add(5, 8));
        System.out.println(c1.add(6, 4, 2));
        System.out.println(c1.add(5.6, 3.5));
    }
}