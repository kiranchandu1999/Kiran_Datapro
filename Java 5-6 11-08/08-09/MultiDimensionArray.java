import java.util.Scanner;

class MultiDimensionArray {
    static double getAverage(int[] arr) { // {60, 80, 72, 90, 75, 60}
        double sum = 0;
        for(int m: arr) {
            sum = sum + m;
        }
        double avg = sum / arr.length;
        return avg;
    }
    public static void main(String[] args) {
        // 2D array
        // int[][] marks = new int[3][6];

        // Scanner sc = new Scanner(System.in);
        // for(int i=0; i<marks.length; i++) {
        //     for(int j=0; j<marks[i].length; j++) {
        //         marks[i][j] = sc.nextInt();
        //     }
        // }

        int[][] marks = {{60, 80, 72, 90, 75, 60}, 
                        {92, 75, 69, 80, 85, 71}, 
                        {58, 91, 90, 67, 79, 83}};

        // find the average for each student
        for(int i=0; i<3; i++) {
            System.out.println("Student-" + (i+1) + " marks average: " + getAverage(marks[i]));
        }


        // 2D array using forEach loop
        for(int[] x: marks) {
            for(int y: x) {
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
}