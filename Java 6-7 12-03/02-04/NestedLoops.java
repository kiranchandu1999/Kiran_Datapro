public class NestedLoops {
    public static void main(String[] args) {
        // patttern
        /*
        *
        * *
        * * *
        * * * *
        * * * * *
        */

        for(int i=1; i<=5; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        /*
        1
        2   3
        4   5   6
        7   8   9   10
        */

        int count = 1;
        for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++) {
                System.out.print(count + "\t");
                count++;
            }
            System.out.println();
        }

        /*
                *
              * *
            * * *
          * * * *
        * * * * *
        */

        for(int i=1; i<=5; i++) {
            // for loop for printing spaces
            for(int j=1; j<=(5-i); j++) {
                System.out.print("  ");
            }
            // for loop for printing stars
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            // for new line
            System.out.println();
        }
    }
}
