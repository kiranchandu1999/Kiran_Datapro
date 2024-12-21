package OOPS;

public class FactorialExample {
    // 5! ----> 5 * 4 * 3 * 2 * 1
    static int fact(int n){
        // base
        if(n == 1) return 1;

        return n * fact(n-1);
    }

    public static void main(String[] args) {
        System.out.println(fact(5));   
    }
}
