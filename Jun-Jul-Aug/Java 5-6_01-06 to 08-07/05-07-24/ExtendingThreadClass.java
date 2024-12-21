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
        // first thread
        Myclass mc1 = new Myclass();
        mc1.start();

        // second thread
        Myclass mc2 = new Myclass();
        mc2.start();

        for(int i=1; i<=100; i++){
            System.out.println("main " + i);
        }

        System.out.println(Thread.currentThread().getName());
    }
}
