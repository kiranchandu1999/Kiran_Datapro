class NestedLoop {
    public static void main(String[] args) {
        // Nested loops
        // pattern problems
        int n = 6;
        // outer loop for lines
        for(int i=1; i<=n; i++) {
            // inner loop for stars at each line
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}