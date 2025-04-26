import java.util.Scanner;

public class MarksManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // arrays
        // array declaration and initialization
        // int[] marks = {85, 60, 95, 78, 72, 90};
        System.out.println("Enter marks array size:");
        int size = sc.nextInt();
        int[] marks = new int[size];

        // assigning marks
        // to take inputs from user, using Scanner class
        
        System.out.println("Please Enter you marks");

        // assinging values using loop
        for(int i=0; i<=marks.length-1; i++) {
            marks[i] = sc.nextInt();
        }

        System.out.println("-----------------");

        for(int i=0; i<=marks.length-1; i++) {
            System.out.println(marks[i]);
        }
    }
}