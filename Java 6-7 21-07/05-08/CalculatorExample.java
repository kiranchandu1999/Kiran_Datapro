class Calculator {
    // attributes
    int price;

    // default constructor
    Calculator() {}

    // methods
    int add(int a, int b) {
        // method body
        int sum = a + b;
        return sum;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    void subtract(int n1, int n2) {
        System.out.println(n1 - n2);
    }

    String getCalcBrand() {
        return "Casio";
    }
}

class CalculatorExample {
    public static void main(String[] args) {
        // object creation
        Calculator cal1 = new Calculator();
        cal1.price = 1000;
        // method calling
        int res = cal1.add(10, 20);
        System.out.println(cal1.add(50, 60));
        System.out.println(res);
        System.out.println(cal1.multiply(8, 3));
    }
}