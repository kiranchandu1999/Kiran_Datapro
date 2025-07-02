import java.util.Scanner;

class Calculator {
    // properties
    String color;
    int price;

    // methods
    int add(int n1, int n2) {
        int sum = n1 + n2;
        return sum;
    }

    double add(double n1, double n2) {
        double sum = n1 + n2;
        return sum;
    }

    void hello() {
        System.out.println("Hi, I'm digital calculator!!!");
    }
}

class CalculatorExample {
    public static void main(String[] args) {
        // to take user input
        Scanner input = new Scanner(System.in);
        Calculator c1 = new Calculator();

        System.out.println("Enter number1: ");
        int num1 = input.nextInt();
        System.out.println("Enter number2: ");
        int num2 = input.nextInt();
        int res1 = c1.add(num1, num2);
        System.out.println(res1);

        c1.add(5.35, 8.65);

        c1.hello();
    }
}