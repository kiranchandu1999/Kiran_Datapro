class MathClassExample {
    public static void main(String[] args) {
        // methods inside Math class
        int num1 = 50;
        int num2 = 65;
        // abs() method return positive values
        System.out.println(Math.abs(num1-num2));

        // min() and max() methods
        int[] arr = {5, 8, 10, 4, 2, 12};
        int highest = 0;
        int lowest = arr[0];

        for(int x: arr) {
            // if(x > highest) {
            //     highest = x;
            // }
            // if(x < lowest) {
            //     lowest = x;
            // }
            highest = Math.max(highest, x);
            lowest = Math.min(lowest, x);
        }
        System.out.println("Highest: " + highest);
        System.out.println("Lowest: " + lowest);

        // pow() and sqrt()
        System.out.println("2 to the power of 4: " + Math.pow(2, 4));
        System.out.println("Root of 256: " + Math.sqrt(256));

        // floor(), ceil() and round()
        System.out.println("floor value of 25.78: " + Math.floor(25.78));
        System.out.println("ceil value of 56.23: " + Math.ceil(56.23));
        System.out.println("round value of 16.52: " + Math.round(16.52));
        System.out.println("round value of 16.32: " + Math.round(16.32));

        // random()
        for(int i=1; i<=5; i++) {
            System.out.println(Math.round(Math.random()*10)); // it will generate random numbers from 0 to 1
        }
    }
}