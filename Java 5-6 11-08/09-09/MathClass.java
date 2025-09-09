public class MathClass {
    public static void main(String[] args) {
        int n1 = 15, n2 = 20;

        System.out.println(Math.abs(n1-n2)); // always return positive

        // find min and max
        System.out.println(Math.min(n1, n2)); // 15
        System.out.println(Math.max(n1, n2)); // 20
        int[] grades = {6, 5, 9, 8};
        int maxi = 0;
        for(int g: grades) {
            maxi = Math.max(maxi, g);
        }

        // ceil, floor and rounding the decimal numbers
        System.out.println("Ceil: " + Math.ceil(16.23)); // 17
        System.out.println("Floor: " + Math.floor(6.98)); // 6
        System.out.println("round: " + Math.round(13.49)); // 13

        // generating random numbers (1 to 10)
        System.out.println(Math.round(Math.random()*10)); // 0.9998 * 10
    }
}
