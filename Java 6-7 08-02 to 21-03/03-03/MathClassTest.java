public class MathClassTest {
    static int getDifference(int a, int b) {
        return a - b;
    }
    public static void main(String[] args) {
        int[] arr = {-5, -15, -20, -10, -32};
        // find the largest
        int largest = Integer.MIN_VALUE;

        for(int val: arr) {
            largest = Math.max(val, largest);
        }

        System.out.println(largest);


        // get the differnce of two number
        System.out.println(Math.abs(getDifference(10, 15)));

        System.out.println(Math.round(53.6));

        for(int i=1; i<=5; i++) {
            System.out.println(Math.round(Math.random()*10));
        }

    }
}