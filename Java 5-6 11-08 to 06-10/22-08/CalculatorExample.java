class Calculator {
    // properties
    int price;

    // methods
    // definition
    int add(int n1, int n2) {
        // method body
        int sum = n1 + n2;
        return sum;
    }

    double multiply(double n1, double n2) {
        double res = n1 * n2;
        return res;
    }

    void switchOn() {
        System.out.println("Casio: Happy calculating..");
    }
}

class CalculatorExample {
    public static void main(String[] args) {
        // calculator object
        Calculator c1 = new Calculator();
        c1.price = 500;
        // method calling
        int res = c1.add(10, 15);
        System.out.println(res);
        System.out.println(c1.price);
        System.out.println(c1.add(50, 20));
        System.out.println(c1.multiply(3.5, 1.2));
        c1.switchOn();
    }
}