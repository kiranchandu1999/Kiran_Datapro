class Operators2 {
    public static void main(String[] args) {
        // logical operators
        int age1 = 21;
        int age2 = 30;

        System.out.println(age1 >= 18);
        System.out.println(age1 <= 24);

        System.out.println((age1 >= 18) && (age1 <= 24));

        System.out.println((age2 >= 18) && (age2 <= 24));

        System.out.println((age2 >= 18) || (age2 <= 24));


        // assignment operators
        int balance = 1000;

        // balance = balance + 500;

        balance += 500;
        balance -= 200;
        balance *= 2;
        balance /= 2;
        balance %= 2;

        System.out.println(balance);

        // bitwise operators
        System.out.println(5 & 3); // 101 & 011  ---->  001
        System.out.println(5 | 3); // 101 | 011  ---->  111
        System.out.println(5 ^ 3); // 101 ^ 011  ---->  110
    }
}