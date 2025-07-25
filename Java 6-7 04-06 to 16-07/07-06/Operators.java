class Operators {
    public static void main(String[] args) {
        // Arithmetic operators (+, -, *, /, %)
        int a = 15, b = 10;
        int res = a / b;
        System.out.println(res);
        System.out.println(a % b);

        // Comparison operators (<, <=, >, >=, ==)
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a == b);

        // Logical operators (&&, ||, !)
        boolean c = !true;
        System.out.println(c);
        System.out.println((a > b) && (a == b)); // false
        System.out.println((a > b) || (a == b)); // true

        // Assignment operators (=, +=, -=, *=, /=, %=)
        int sum = a + b;
        sum += 50; // sum = sum + 50;

        // bitwise operators (&, |, ^)
        System.out.println(5 & 3); // 101 & 011  ==> 001 (1)
        System.out.println(6 | 2); // 110 | 010  ==> 110 (6)
        System.out.println(6 ^ 2); // 110 ^ 010  ==> 100 (4)

        // shift operators (<<, >>)
        System.out.println(5 << 1); // 101 << 1 ==> 1010 (10)
        System.out.println(8 >> 2); // 1000 >> 2 ==> 0010 (2)

        // unary operators (++, --)
        int x = 10;
        System.out.println(++x); // 11
        System.out.println(x++); // 11

        int y = x++;
        System.out.println(--y); // 11
        System.out.println(x--); // 13
    }
}