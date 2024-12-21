public class MethodArgumentsPassing {

    static void change(int a){
        a = a + 10;
    }

    static void change(int[] b){
        b[0] = b[0] + 1;
    }

    public static void main(String[] args) {
        int num = 5;
        int[] arr = {10};

        // passing by value
        change(num);
        
        // System.out.println(num);

        // passing by reference
        change(arr);
        System.out.println(arr[0]);
    }
}
