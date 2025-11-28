public class NestedLoopExample {
    public static void main(String[] args) {
        /* 
        *
        * *
        * * *
        * * * *
        * * * * *
        */
        int n = 5;
        // Outer loop for lines
        for(int i=1; i<=n; i++) {
            // inner loop for pritning stars in each line
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
