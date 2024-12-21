package OOPS;

import java.util.Scanner;

class Dummy {
    int add (int[] arr){
        int sum = 0;
        for(int v : arr){
            sum = sum + v;
        }
        return sum;
    }

    void add (int a, int b){
        a = a + 10;
        b = b + 10;
    }

    void change (int[] arr){
        arr[0] = 100;
    }
}


public class ArrayExample {
    public static void main(String[] args) {
        // int a = 10, b = 5, c = 20;
        // int [] arr1 = new int[5];
        int[] arr1 = {10, 5, 20, 12, 25, 5, 36};

        int len = arr1.length;
        
        // arr1[0] = 10;
        // arr1[1] = 5;
        // arr1[2] = 20;
        // arr1[3] = 12;
        // arr1[4] = 25;
        // Scanner sc = new Scanner(System.in);
        // for(int i=0; i<len; i++){
        //     arr1[i] = sc.nextInt();
        // }

        // Dummy d = new Dummy();
        // int val = d.add(arr1);

        // d.add(a, b);

        new Dummy().change(arr1);

        // System.out.println(a);
        // System.out.println(b);

        // System.out.println(val);
        // System.out.println(arr1[0]);
        // System.out.println(arr1[1]);
        // System.out.println(arr1[2]);

        for(int i=0; i<len; i++){
            if(i % 2 == 0){
                // System.out.println(arr1[i]);
            }
        }

        // for each loop
        for(int num : new int[] {5, 10, 15}) {
            System.out.println(num);
        }
    }
}
