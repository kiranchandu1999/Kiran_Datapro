package OOPS;


public class Recursion {

    static int cnt = 0;
    static void m1() {
        cnt++;
        System.out.println(cnt);

        if(cnt == 10) return;
        m1();
    }
    public static void main(String[] args) {
        m1();
    }
}
