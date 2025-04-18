class ForLoopExample {
    public static void main(String[] args) {
        // for loop
        for(int i=1; i<=10; i++) {
            // loop body
            System.out.println(i);
        }

        // print even numbers from 1 to 20
        for(int i=1; i<=20; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }

        // nested loop
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

        int n = 5;
        for(int i=1; i<=n; i++) {
            // for spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print("  ");
            }
            // for stars
            for(int k=1; k<=i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}