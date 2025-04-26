class LiteralsExample {
    public static void main(String[] args) {
        // literlas
        int num1 = 10;
        long num2 = 25L;

        float num3 = 16.58f;
        double num4 = 12.62;

        char char1 = 'x';
        boolean bool1 = true;

        // binary, octal, hexa literals
        int binNum1 = 0b1010; // 
        System.out.println(binNum1);

        int octNum1 = 0157; // 64 + 40 + 7
        System.out.println(octNum1);

        int hexaNum1 = 0x2E; // 32 + 14
        System.out.println(hexaNum1);

        // int literals with '_'
        int num5 = 2_54_63_215;
        System.out.println(num5);
    }
}