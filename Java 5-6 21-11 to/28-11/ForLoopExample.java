public class ForLoopExample {
    public static void main(String[] args) {
        // For loop
        // Print 1-N natural numbers
        int n = 10;
        for(int i=1; i<=n; i++) {
            System.out.println(i);
        }

        // print 1-20 numbers which are multiple of 3
        for(int i=1; i<=20; i++) {
            if(i % 3 == 0) {
                System.out.println(i +" is multiple of 3");
            }
        }

        // print first 8 fibonacci numbers
        int n1 = 0, n2 = 1;
        for(int i=1; i<=8; i++) {
            int next = n1 + n2; // finding next number
            System.out.println(n1); // printing n1
            // updating n1 with n2 and n2 with next
            n1 = n2;
            n2 = next;
        }
    }
}
