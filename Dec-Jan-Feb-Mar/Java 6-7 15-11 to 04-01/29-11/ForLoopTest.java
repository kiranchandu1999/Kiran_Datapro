public class ForLoopTest {
    public static void main(String[] args) {
        
        for(int i = 1;i <= 10;i++) {
            System.out.println("Datapro");
        }

        /*
        *          1
        * *        2
        * * *      3
        * * * *    4
        * * * * *  5
         */
        for(int r = 1; r <= 5; r++) {
            for(int c = 1;c <= r; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // mirror image of above traingle
        /*
                *    1  (5 - 1)
              * *    2
            * * *    3
          * * * *    4
        * * * * *    5
        */
        int m = 5;
        for(int r = 1; r <= 5; r++) {
            for(int c1 = 1;c1 <= (m - r) ; c1++) {
                System.out.print("  ");
            }

            for(int c2 = 1;c2 <= r ; c2++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}