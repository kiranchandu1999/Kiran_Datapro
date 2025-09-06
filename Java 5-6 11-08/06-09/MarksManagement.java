import java.util.Scanner;

class MarksManagement {
    public static void main(String[] args) {
        // Array declaration
        int[] marks = new int[6]; // []
        // declaration and initialization
        int[] marks2 = {90, 89, 65, 81, 92, 60};
        // assigning values
        // marks[0] = 95;
        // marks[1] = 80;
        // marks[2] = 69;
        // marks[3] = 78;
        // marks[4] = 86;
        // marks[5] = 90;

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<marks.length; i++) {
            marks[i] = sc.nextInt();
        }

        System.out.println("===== Marks =====");
        for(int i=0; i<marks.length; i++) {
            System.out.println(marks[i]);
        }


        // marks2 data
        System.out.println("==== Marks 2 ====");
        // for each loop
        for(int x: marks2) {
            System.out.println(x);
        }
    }
}