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
        MethodClass obj = new MethodClass();
        // greet method calling
        System.out.println(obj.greet("Chandrish"));

        obj.greetAndPrint("Ram");

        // add 2 numbers and print
        System.out.println(obj.add(15, 20));

        // add 2 numbers and multiply it with 10 and then print
        int sum = obj.add(15, 8);
        System.out.println(sum * 10);
    }
}