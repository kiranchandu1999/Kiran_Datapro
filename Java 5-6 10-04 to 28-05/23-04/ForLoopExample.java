class ForLoopExample {
    public static void main(String[] args) {
        // for loop
        // print your name, college, email 5 times
        // initialization; condition; increment/decrement
        for(int i=1; i<=5; i++) {
            System.out.println("Chandrish");
            System.out.println("AZP");
            System.out.println("chandrish@gmail.com");
        }

        // print numbers divisible by 3 from 1 to 25
        for(int i=1; i<=25; i++) {
            if(i%3 == 0) {
                System.out.println(i);
            }
        }
    }
}