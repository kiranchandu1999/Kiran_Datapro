class Operators2 {
    public static void main(String[] args) {
        // logical operators
        int a = 15;
        int b = 26;
        int c = 10;

        System.out.println((a%3 == 0) && (a <= b)); // true

        System.out.println((c > b) || (c%4 != 0)); // true

        System.out.println((c > b) || (c%5 != 0)); // false

        // assignment operators
        int num1 = 50;
        // adding 10 to num1
        // num1 = num1 + 10;
        num1 += 10;

        // bitwise operators
        int x = 7;
        int y = 5;

        System.out.println("x and y: " + (x & y));  // 111 & 101 = 101

        System.out.println("x or y: " + (x | y)); // 111 | 101 =  111

        System.out.println("x ex-or y: " + (x ^ y)); // 111 ^ 101 = 010

        // shift operators
        System.out.println("5 << 1: " + (5 << 1)); // 101 << 1 = 1010

        System.out.println("10 >> 2: " + (10 >> 2)); // 1010 >> 2 = 0010

        // Unary operators
        int val1 = 15;
        // ++val1; // pre-increment
        // val1++; // post-increment
        int val2 = val1++;
        int val3 = ++val1;

        System.out.println(val1); // 17
        System.out.println(val2); // 15
        System.out.println(val3); // 17

        val2 = val1--;
        val3 = --val1;

        System.out.println(val1); // 15
        System.out.println(val2); // 17
        System.out.println(val3); // 15
    }
}