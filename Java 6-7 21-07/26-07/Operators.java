class Operators {
    public static void main(String[] args) {
        // bitwise operators
        System.out.println(9 & 3); // 1
        System.out.println(7 | 8); // 15
        
        // Shift operators
        System.out.println(11 << 2); // 1011 << 2 --> 101100

        // Unary operators
        int x = 10;
        int y = 20;
        // x++;
        // --y;
        System.out.println(x++); // 10
        System.out.println(--y); // 19
        int a = --x; 
        int b = y++;
        System.out.println(a); // 10
        System.out.println(b); // 19
    }
}