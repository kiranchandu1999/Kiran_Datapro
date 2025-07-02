class Calculator {
    // method overloading (compiletime polymorphism)
    int add(int n1, int n2) {
        return n1 + n2;
    }

    int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    double add(double n1, double n2) {
        return n1 + n2;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        int res1 = c1.add(10, 5, 18);
        double res2 = c1.add(8.6, 14);

        System.out.println(res1 + ", " + res2);
    }
}
