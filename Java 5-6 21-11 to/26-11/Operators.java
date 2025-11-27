public class Operators {
    public static void main(String[] args) {
        // Operators
        // Arithmetic
        int n1 = 8, n2 = 6;
        System.out.println("Reminder: " + (n1 % n2));

        // Comparison and logical operators
        System.out.println((n1 != 0) && (n1 > n2)); // true

        // Assignment operators
        // increment n2 value by 3 times
        // n2 = n2 * 3;
        n2 *= 3;
        System.out.println("Three times of n2: " + n2); // 18

        // Bitwise operators
        int x = 6, y = 8;

        System.out.println(x & y); // 110 & 1000 ===> 0
        System.out.println(x ^ y); // 110 ^ 1000 ===> 1110

        // shift operators
        // find whether the 5th bit of 27 is true or false
        int z = 27;
        boolean res = (z & (1 << 4)) != 0;
        System.out.println("5th bit of 27: " + res);

        // Unary operators
        int a = 5;
        int b = a++;

        System.out.println(++a); // 7
        System.out.println(b++); // 5

        a = --b;
        System.out.println(a--); // 5
        System.out.println(b--); // 5
    }
}
