class Calculator {
    // method for adding 2 numbers
    int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    // 
    int add(int a, int b, int c) {
        int sum = a + b + c;
        return sum;
    }

    // polymorphism not possible by return type
    // long add(int a, int b) {
    //     long sum = a + b;
    //     return sum;
    // }

    double add(double a, double b) {
        double sum = a + b;
        return sum;
    }
}

public class CalculatorExample {
    public static void main(String[] args) {
        // object creation
        Calculator c1 = new Calculator();
        int res = c1.add(50, 45);

        double res2 = c1.add(25, 55.3);

        System.out.println(res);

        System.out.println(res2);
    }
}