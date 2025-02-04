class ForLoopTest {
    public static void main(String[] args) {
        System.out.println("For loop.....");
        
        // for loop
        for(int i=1; i<=5; i++) {
            System.out.println("Hello");
        }

        // print numbers from 1 to 10
        for(int i=1; i<=10; i++) {
            System.out.println(i);
        }

        // print numbers from 15 to 5
        for(int i=15; i>=5; i--) {
            System.out.println(i);
        }

        // print even numbers from 1 to 20
        for(int i=1; i<=20; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}