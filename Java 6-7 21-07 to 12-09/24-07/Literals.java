class Literals {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);

        // literals
        long b = 25L;
        System.out.println(b);

        double c = 10.6;
        float d = 5.2f;

        char ch = 'j';
        boolean bool = true;

        // binary, octal and hexa-deci
        int bin = 0b101;
        System.out.println(bin); // 5

        int oct = 016;
        System.out.println(oct); // 14

        int hexa = 0x1f;
        System.out.println(hexa); // 31

        // unicode system
        System.out.println("\u0044"); // D
    }
}