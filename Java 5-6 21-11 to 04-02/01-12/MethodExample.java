class Calculator {
    // variables
    int price;
    String model;

    // methods
    // method definition
    int add() {
        int sum = 5 + 6;
        return sum;
    }

    // method with input parameters
    int multiply(int a, int b) {
        int mul = a * b;
        return mul;
    }

    void displayBrand() {
        System.out.println("Casio - Happy Calculating..");
    }
}

public class MethodExample {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        // to execute the method we need to call or invoke
        int res1 = c1.add();
        System.out.println(res1); // 11

        System.out.println(c1.multiply(5, 3)); // 15

        c1.displayBrand();
    }
}
