import java.util.Scanner;

class OperatorsExample {
	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		// System.out.println("Enter number1: ");
		// int num1 = sc.nextInt();
		// System.out.println("Enter number2: ");
		// int num2 = sc.nextInt();
		// System.out.println(num1 +  num2);

		// bit wise operators
		int a = 5, b = 8, c = 10, d = 15;
		System.out.println(a ^ b); // 101 ^ 1000 ---> 1101 (13)

		System.out.println(b >> 2); // 1000 >> 2 ---> 0010 (2)

		int x = 15;
		x--;
		int y = ++x; // 15
		--y; // 14

		System.out.println(x++); // 15
		System.out.println(--y); // 13
		--x; // 15
		y = x; // 15
		System.out.println(y++); // 15
	}
}