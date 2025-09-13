class Calculator {
    int add(int n1, int n2) {
        return n1 + n2;
    }
    // Method overloading
    int add(int n1, int n2, int n3) {
        return n1+n2+n3;
    }

    void add(double n1, double n2) {
        System.out.println(n1 + n2);
    }
}

class MethodOverloading {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        System.out.println(c1.add(10, 15));
        System.out.println(c1.add(15, 8, 5));
        c1.add(5.6, 8.5);
    }
}