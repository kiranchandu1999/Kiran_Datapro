class ForLoopExample {
    public static void main(String[] args) {
        // for loop
        for(int i=1; i<=10; i++) {
            System.out.println("Hello");
        }

        // print numbers from 25 to 32
        for(int i=25; i<=32; i++) {
            System.out.println(i);
        }

        // print odd numbers from 1 to 20
        for(int i=1; i<=20; i++) {
            if(i%2 != 0) {
                System.out.println(i);
            }
        }
    }
}