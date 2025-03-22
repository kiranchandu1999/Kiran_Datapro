class Operators {
    public static void main(String[] args) {
        // Arithmetic operators
        int a = 10, b = 4;

        System.out.println(a+b); // 14
        System.out.println(a/b); // 2
        System.out.println(a%b); // 2

        // Comparison operators
        System.out.println(a < b); // false
        System.out.println(a >= b); // true
        System.out.println(a == 50); // false
        System.out.println(a != b); // true

        // Logical operators
        System.out.println((a < b) && (b > 5)); // false
        System.out.println((a > b) || (b < a)); // true

        // bitwise operators
        System.out.println(7 & 3); // 111 & 011 ===>  011 (3)
        System.out.println(5 ^ 2); // 101 ^ 010 ===>  111  (7)

        // shift operators
        System.out.println(7 << 1); // 111 << 1  ===> 1110
        System.out.println(10 >> 1); // 1010 >> 1  ===> 101

        // unary operators
        int x = 10;

        System.out.println(++x); // 11
        System.out.println(x);   // 11
        System.out.println(x++); // 11

        System.out.println(x--); // 12
        System.out.println(x);  //  11
        System.out.println(--x); // 10
    }
}