class Operators {
    public static void main(String[] args) {
        // Arithmetic operators
        int num1 = 10;
        int num2 = 20;

        int num3 = 8, num4 = 12;

        int sum = num1 + num2;

        System.out.println("Addition: " + sum);

        System.out.println("Subtraction: " + (num2 - num1));

        System.out.println("Multiplication: " + (num1 * num2));

        System.out.println("Division: " + (num2 / num1));

        System.out.println("Reminder: " + (num2 % num1));

        // System.out.println(num3 + num4);

        // Comparison operators
        System.out.println(num1 + " less than " + num2 + " ==> " + (num1 < num2));

        System.out.println(num1 + " greater than " + num2 + " ==> " + (num1 > num2));

        System.out.println(num1 + " less than or equal to " + num2 + " ==> " + (num1 <= num2));

        System.out.println(num1 + " not equal to " + num2 + " ==> " + (num1 != num2));


        // Logical operators
        System.out.println(num3 + " is positive and " + num3 + " less than " + num4 + " ==> " + ((num3 > 0) && (num3 < num4)));

        System.out.println(num3 + " is either positive or " + num3 + " greater than " + num4 + " ==> " + ((num3 > 0) || (num3 > num4)));
    }
}