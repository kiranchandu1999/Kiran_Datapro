class Calculator {
    // methods
    int add(int a, int b) {
        // method body
        int sum = 0;
        sum = a + b;
        return sum;
    }

    void displayResult(int a, int b) {
        int mul = a * b;
        System.out.println(mul);
    }
}

public class CalculatorExample {
    public static void main(String[] args) {
        // calculator object
        Calculator cal1 = new Calculator();
        int res = cal1.add(10, 5);
        System.out.println(res);

        cal1.displayResult(10, res);
    }
}
