class MyThread1 extends Thread {
    public void run() {
        runLoop();
    }

    void runLoop() {
        for(int i=1; i<=10; i++) {
            System.out.println("MyThread1 " + i + " " + Thread.currentThread().getName());
            try{
                Thread.sleep(500);
            }
            catch(Exception e) {
            }
        }
    }
}

public class ThreadClassTest {
    public static void main(String[] args) {
        MyThread1 m1 = new MyThread1();
        m1.start();

        MyThread1 m2 = new MyThread1();
        m2.start();
       

        for(int i=1; i<=10; i++) {
            System.out.println("Main " + i + " " + Thread.currentThread().getName());
            try{
                Thread.sleep(500);
            }
            catch(Exception e) {
            }
        }
    }
}