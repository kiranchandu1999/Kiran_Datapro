class Myclass extends Thread{
    public void run(){
        count();
    }

    void count(){
        for(int i=1; i<=100; i++){
            System.out.println("myclass " + i);
        }
        System.out.println(Thread.currentThread().getName());
    }
}

public class ExtendingThreadClass {
    public static void main(String[] args) {

        for(int i=1; i<=100; i++){
            System.out.println("main " + i);
        }

        System.out.println(Thread.currentThread().getName());

        Myclass m1 = new Myclass();
        m1.start();

        Myclass m2 = new Myclass();
        m2.start();
    }
}
