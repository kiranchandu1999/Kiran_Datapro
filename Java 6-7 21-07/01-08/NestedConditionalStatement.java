class NestedConditionalStatement {
    public static void main(String[] args) {
        // variables declaration
        int age = 20;
        boolean hasDrivingLicense = true;
        boolean ownCar = true;

        if(age >= 18) {
            System.out.println("You are an adult");
            if(hasDrivingLicense) {
                System.out.println("You can drive a car");
                if(ownCar) {
                    System.out.println("You can drive your own car");
                }
                else {
                    System.out.println("You can drive, you don't have own car");
                }
            }
            else {
                System.out.println("You can't drive a car");
            }
        }
        else {
            System.out.println("Your are child");
        }


        // print even or odd
        int num = 15;
        if(num % 2 == 0) {
            System.out.println("Given number is even");
        }
        else {
            System.out.println("Given number is odd");
        }

        // using ternary operator
        // (conditon) ? true_expression : false_expression;
        String result = (num % 2 == 0) ? "Given number is even" : "Given number is odd";
        System.out.println(result);
    }
}