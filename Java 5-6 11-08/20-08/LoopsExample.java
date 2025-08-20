class LoopsExample {
    public static void main(String[] args) {
        // for loop -> when we know the no of iterations
        // problem: print "Hello" 5 times
        for(int i=1; i<=5; i++) {
            // loop body
            System.out.println("Hello");
        }

        // problem: print even numbers from 1 to 20
        int n = 20;
        for(int i=1; i<=n; i++) {
            if(i%2 == 0) {
                System.out.println(i);
            }
        }


        // while loop - when we don't know the no of iterations
        // problem: sum of digits in given number
        // Ex: 563 ---> 14
        int number = 563;
        int sum = 0;
        int rem = 0;

        // rem = number % 10; // 3
        // sum = sum + rem;
        // number = number / 10; // 56

        // rem = number % 10; // 6
        // sum = sum + rem;
        // number = number / 10; // 5

        // rem = number % 10; // 5
        // sum = sum + rem;
        // number = number / 10; // 0

        while(number != 0) {
            rem = number % 10;
            sum = sum + rem;
            number = number / 10; 
        }

        System.out.println(sum);


        // do while loop -> it'll run atleast one time
        int num = 11;

        do {
            System.out.println(num);
            num++;
        } while(num <= 5);
    }
}