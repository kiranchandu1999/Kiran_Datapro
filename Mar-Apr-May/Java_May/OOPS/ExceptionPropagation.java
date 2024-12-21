package OOPS;

import java.io.IOException;

class ABC {
    void m1(){
        try{
        m2();
        } catch (Exception e ){
            System.out.println(e.getMessage());
        }
    }

    void m2() throws Exception{
        m3();
    }

    void m3() throws Exception{
        // int a = 5/0;
        throw new IOException("IO");
    }
}

public class ExceptionPropagation {
    public static void main(String[] args) {
        ABC ob1 = new ABC();

        try{
            ob1.m1();
        } catch (Exception e ){
            System.out.println(e.getMessage());
        }

        System.out.println("output");
    }
}
