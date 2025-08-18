class Operators {
    public static void main(String[] args) {
        // operators
        // bitwise operators
        int n1 = 10;
        int n2 = 8;
        n1 &= 3; // 1010 & 011 --->  0010 (2)
        System.out.println(n1); // 2
        n2 ^= 5; // 1000 ^ 101 ---> 1101 (13)
        System.out.println(n2); // 13

        // shift operators
        System.out.printf("8 >> 2 : %d\n", 8 >> 2); // 1000 >> 2 ---> 10 (2)

        // unary operators
        int x = 12;
        int y = x++;
        int z = --y;
        
        System.out.println(z++); // 11
        y = z;
        System.out.println(++y); // 13
        System.out.println(x); // 13
    }
}