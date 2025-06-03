class Calculator {
    int add(int num1, int num2) {
        return num1 + num2;
    }

    // method overloading (or) compiletime polymorphism
    // possible by providing different no of params
    int add(int num1, int num2, int num3) {
        return add(num1, num2) + num3;
    }

    // possible by providing same no of params with different datatype
    long add(long num1, long num2) {
        return num1 + num2;
    }
}

public class PolyMorphismExample {
    public static void main(String[] args) {
        // calculator object
        Calculator c1 = new Calculator();
        System.out.println(c1.add(10, 5));

        System.out.println(c1.add(5, 8, 4));
    }
}
