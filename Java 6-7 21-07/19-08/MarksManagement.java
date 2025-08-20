class Car {
    void start() {
        System.out.println("Engine starting..");
    }

    void drive() {
        start();
        System.out.println("Driving the car..");
    }
}

class MarksManagement {
    static double getAverage(int[] marks) {
        // calculate average of given marks
        int len = marks.length;
        double sum = 0;
        for(int i=0; i<len; i++) {
            sum += marks[i];
        }
        double avg = sum / len;
        return avg;
    }
    public static void main(String[] args) {
        // array declaration
        // int[] arr = new int[6];
        // Declaration with initialization
        int[] marks = {80, 65, 92, 96, 78, 60};
        // print 3rd subject marks
        System.out.println(marks[2]);

        double avg = getAverage(marks);
        System.out.println("Marks average: " + avg);

        // multi dimension array
        int[][] allMarks = {
            {58, 65, 96, 70, 45, 99},
            {95, 88, 82, 81, 75, 60},
            {80, 76, 61, 93, 91, 90}
        };

        // print marks as a matrix
        for(int i=0; i<allMarks.length; i++) {
            // inner loop for individual 1D arrays
            for(int j=0; j<allMarks[i].length; j++) {
                System.out.print(allMarks[i][j] + " ");
            }
            System.out.println();
        }

        for(int i=0; i<allMarks.length; i++) {
            double stuAvg = getAverage(allMarks[i]);
            System.out.println("Student " + (i+1) + " average: " + stuAvg);
        }


        // forEach loop or Enhanced for loop
        // int[] marks = {80, 65, 92, 96, 78, 60};
        System.out.println("Using for each loop");
        for(int m: marks) {
            System.out.println(m);
        }

        // print 2D array as a matrix using for each loop
        for(int[] m: allMarks) {
            for(int n: m) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}