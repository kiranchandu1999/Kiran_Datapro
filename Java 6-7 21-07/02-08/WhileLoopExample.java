class WhileLoopExample {
    public static void main(String[] args) {
        int num = 5863;
        // print the sum of digits in given number = 22
        int sum = 0, rem = 0;
        // // to grab 3
        // rem = num % 10;
        // sum = sum + rem;
        // num = num / 10;

        // // to grab 6
        // rem = num % 10;
        // sum = sum + rem;
        // num = num / 10;

        // // to grab 8
        // rem = num % 10;
        // sum += rem;
        // num = num / 10;

        // // to grab 5
        // rem = num % 10;
        // sum += rem;
        // num = num / 10;

        // using while loop
        while(num != 0) {
            // loop body
            rem = num % 10;
            sum += rem;
            num = num / 10;
        }

        System.out.println("Total digits sum: " + sum);

    }
}