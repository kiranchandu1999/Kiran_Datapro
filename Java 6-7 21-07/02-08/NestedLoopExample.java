public class NestedLoopExample {
    public static void main(String[] args) {
        /*
        *
        * *
        * * *
        * * * *
        * * * * * 
        */

        // outer loop (lines)
        for(int i=1; i<=5; i++) {
            // inner loop (stars)
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
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
        int n = 5;
        for(int i=1; i<=n; i++) {
          // inner loop spaces
          for(int j=1; j<=n-i; j++) {
            System.out.print("  ");
          }

          // inner loop for stars
          for(int j=1; j<=i; j++) {
            System.out.print("* ");
          }

          System.out.println();
        }
    }
}
