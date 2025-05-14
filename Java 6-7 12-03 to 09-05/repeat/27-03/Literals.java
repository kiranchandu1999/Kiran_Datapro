class Literals {
    public static void main(String[] args) {
        byte num1 = 100;
        short num2 = 30000;
        int num3 = 50;
        long num4 = 401L;

        float num5 = 1.5f;
        double num6 = 20.68;

        System.out.println(num5);

        // literals using underscore (_)
        int num7 = 5_85_000;
        System.out.println(num7);

        // binary, octal and hexa decimal literals
        int bin1 = 0b1010;
        System.out.println(bin1);

        int oct1 = 016;
        System.out.println(oct1);

        int hex1 = 0x1A;
        System.out.println(hex1);
        /*
        multi line
        comment
        */
        
        String name1 = "varshita";
        String name2 = "pujitha";

        System.out.printf("Hi %s", name1);
        System.out.printf("\nHi %s", name2);
    }
}