class MyThread extends Thread {
    @Override
    public void run() {
        countAndDisplay();
    }

    void countAndDisplay() {
        for(int i=1; i<=10; i++) {
            System.out.println("MyThread: " + Thread.currentThread().getName() + " " + i);
        }
    }
}

public class ThreadClassTest {
    public static void main(String[] args) {
        MyThread m1 = new MyThread();
        // m1.run();
        // m1.countAndDisplay();
        m1.start();
        // m1.start();

        MyThread m2 = new MyThread();
        m2.start();

        for(int i=1; i<=10; i++) {
            System.out.println("Main method: " + Thread.currentThread().getName() + " " + i);
        }
    }
}
