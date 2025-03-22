class MathClassExample {
    public static void main(String[] args) {
        // methods in Math class
        int num1 = 15;
        int num2 = 25;
        int res = num1 - num2;
        System.out.println(Math.abs(res));

        // find maximum number
        int[] arr1 = {25, 15, 10, 18, 32, 24, 31};
        int maxNum = Integer.MIN_VALUE;

        for(int x: arr1) {
            maxNum = Math.max(maxNum, x);
        }

        System.out.println(maxNum);

        // find minimum number
        int minNum = Integer.MAX_VALUE;
        
        for(int x: arr1) {
            minNum = Math.min(minNum, x);
        }

        System.out.println(minNum);

        System.out.println(Math.round(5.49));

        System.out.println(Math.pow(2, 3));

        for(int i=1; i<=5; i++) {
            System.out.println(Math.round(Math.random()*100)+100);
        }

    }
}