class MethodClass {
    // methods
    // method definition
    int add(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    String greet(String name) {
        String greeting = "Hello " + name + ", How are you!!!";
        return greeting;
    }

    float floatSum(float f1, float f2) {
        float fSum = f1 + f2;
        return fSum;
    }

    void greetAndPrint(String name) {
        String greeting = "Hello " + name + ", How are you!!!";
        System.out.println(greeting);
    }
}

class MethodExample {
    public static void main(String[] args) {
        MethodClass obj1 = new MethodClass();
        // method calling
        int res = obj1.add(5, 20);
        System.out.println(res);

        System.out.println(obj1.greet("varshitha"));

        float floatRes = obj1.floatSum(15.3f, 5.5f);
        System.out.println(floatRes);

        obj1.greetAndPrint("Deepa");
    }
}