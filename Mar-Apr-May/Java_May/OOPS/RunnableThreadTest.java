package OOPS;

class B1 implements Runnable {
    public void run(){
        for(int i=1; i<=10; i++){
            System.out.println("count " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(Thread.currentThread().getPriority());
    }
}

public class RunnableThreadTest {
    public static void main(String[] args) {
        B1 obj1 = new B1();

        Thread th1 = new Thread(obj1);
        
        th1.setPriority(3);
        th1.start();

        for(int i=1; i<=10; i++){
            System.out.println("main " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        
        System.out.println(Thread.currentThread().getPriority());
    }
}
