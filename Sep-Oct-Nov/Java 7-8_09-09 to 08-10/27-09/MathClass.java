public class MathClass{
    public static void main(String[] args){
        int a = 52;
        int b = 25;

        // System.out.println(Math.abs(b-a));

        // System.out.println(Math.min(a, b));

        int[] arr = {5, 8, 4, 6, 12};

        // int res = Integer.MIN_VALUE;

        // System.out.println(res);

        // for(int e: arr){
        //     res = Math.max(res, e);
        // }

        int res = Integer.MAX_VALUE;

        for(int e : arr){
            res = Math.min(res, e);
        }

        // System.out.println(res);

        // System.out.println(Math.round(5.86));
        // System.out.println((int) Math.pow(2, 3));
        System.out.println((int)(Math.random()*100));
    }
}