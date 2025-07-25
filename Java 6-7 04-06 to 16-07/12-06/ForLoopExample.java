class ForLoopExample {
    public static void main(String[] args) {
        // for loop
        for(int i=1; i<=10; i++) {
            // loop body
            System.out.println("Hello world");
        }

        // print 3's multiples from 1 to 25
        for(int i=1; i<=25; i++) {
            if(i%3 == 0) {
                System.out.println(i);
            }
        }
    }
}