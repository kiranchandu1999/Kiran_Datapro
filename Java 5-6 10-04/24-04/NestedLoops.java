public class NestedLoops {
    public static void main(String[] args) {
        //print following pattern
        /*
        *
        * *
        * * *
        * * * *
        * * * * *
        */

        // outer loop for no of rows (lines)
        for(int i=1; i<=5; i++) {
            // inner loop for printing stars
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        /*
              1
            1 2
          1 2 3  
        1 2 3 4 
        */

        for(int i=1; i<=4; i++) {
            // loop for printing spaces
            for(int j=1; j<=(4-i); j++) {
                System.out.print("  ");
            }
            // loop for printing numbers
            for(int k=1; k<=i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }

        // triangle pattern
        /*
        int n = 3;
            * 
          * * *
        * * * * *
        leading spaces = (n-i)
        stars = (2*i-1)
        */

        /* 
        int n = 5;
        5 4 3 2 1
        4 3 2 1
        3 2 1
        2 1
        1
        */

        int n = 5;
        for(int i=n; i>=1; i--) {
            for(int j=i; j>=1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        /*
        10 9 8 7
        6 5 4
        3 2
        1 
        */
        n = 4;
        int count = 10;
        for(int i=n; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print(count + " ");
                count--;
            }
            System.out.println();
        }
    }
}
