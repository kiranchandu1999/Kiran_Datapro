class Operators3 {
    public static void main(String[] args) {
        // shift operators
        System.out.println(5 << 1);  // 101 << 1 ----> 1010 = 10

        System.out.println(10 >> 3);  // 1010 >> 3 ----> 1 = 1

        // unary opeartors
        int a = 10;

        System.out.println(a++);  // 10
        System.out.println(a);    // 11

        System.out.println(++a);  // 12
        System.out.println(a);    // 12

        System.out.println(a--);  // 12
        System.out.println(a);    // 11

        System.out.println(--a);  // 10
        System.out.println(a);    // 10
    }
}