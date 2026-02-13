class Operators {
    public static void main(String[] args) {
        // Bitwise operators
        int a = 5, b = 3;
        System.out.println(a & b); // 1
        System.out.println(a | b); // 7
        System.out.println(a ^ b); // 6

        // Unary operators
        int x = 10;
        int y = x++;
        System.out.println(++x); // 12
        System.out.println(y++); // 10
        int z = ++x;
        System.out.println(++z); // 14
        System.out.println(y); // 11
    }
}