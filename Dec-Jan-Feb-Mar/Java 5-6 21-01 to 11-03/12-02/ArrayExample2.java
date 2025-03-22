import java.util.Scanner;

class Calculator {
    int add(int[] arr) { // 1, 2, 3
        int sum = 0;

        for(int i=0; i<arr.length; i++) {
            sum = sum + arr[i];
        }

        return sum;
    }
}

class ArrayExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr1 = new int[size];
        // arr1[0] = 5;
        // arr1[1] = 10;
        // arr1[2] = 15;
        // arr1[3] = 20;
        // arr1[4] = 25;

        // inserting values in array
        for(int i=0; i<size; i++) {
            arr1[i] = sc.nextInt();
        }

        Calculator c1 = new Calculator();
        int result = c1.add(arr1);
        System.out.println("Result is: " + result);
        // printing values
        // System.out.println(arr1[0]);
        // System.out.println(arr1[1]);
        // System.out.println(arr1[2]);
        // System.out.println(arr1[3]);
        // System.out.println(arr1[4]);
        System.out.println("=================");

        for(int i=0; i<size; i++) {
            System.out.println(arr1[i]);
        }
    }
}