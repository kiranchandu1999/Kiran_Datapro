class Operators2 {
    public static void main(String[] args) {
        // Assignment operators
        int balance = 500;

        balance = balance + 100;
        balance += 100;  // 700

        // balance = balance * 2;
        balance *= 2;

        System.out.println(balance);


        // bitwise operators
        int a = 5;
        int b = 3;
        int c = a & b;

        System.out.println("result is: " + c); // 101  &  011 --->   001 (1)

        System.out.println(a | b); // 101  |   011  --->  111 (7)

        System.out.println(a ^ b); // 101  ^  011  --->    110  (6)

        
        // shift operators
        System.out.println(a << 2); // 101  <<  1 ---> 10100 (20)

        System.out.println(b >> 1); // 011  >> 1  ---> 01 (1)


        // Unary operators
        int x = 10;
        int y = x++;
        // x++;

        System.out.println(x);
        System.out.println(y);

        int i = 25;
        int j = --i; // j=24, i=24
        j = i--; // j=24, i=23

        System.out.println(i);
        System.out.println(j);
    }
}