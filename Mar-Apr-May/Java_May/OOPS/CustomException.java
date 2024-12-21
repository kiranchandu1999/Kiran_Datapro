package OOPS;

class Example1 {
    void m1(int n){
        if(n > 10){
            throw new RuntimeException("Error");
        }
        System.out.println("Number is : " + n);
    }
}

public class CustomException {
    public static void main(String[] args) {
        Example1 e1 = new Example1();
        e1.m1(15);
    }
}
