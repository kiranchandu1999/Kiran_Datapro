class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    long add(long a, int b) {
        return a + b;
    }
}

class Phone extends Calculator {
    void call() {
        System.out.println("calling..");
    }

    int add(int a, int b) {
        System.out.println("Phone calculator opened..");
        return a + b;
    }
}

class PolymorphismExample {
    public static void main(String[] args) {
        // calculator object
        Calculator c1 = new Calculator();
        int val1 = c1.add(10, 25);
        System.out.println(val1);

        int val2 = c1.add(5, 15, 10);
        System.out.println(val2);

        long val3 = c1.add(40L, 20);
        System.out.println(val3);

        // phone object
        Phone p1 = new Phone();
        int val4 = p1.add(5, 10);
        System.out.println(val4);
    }
}