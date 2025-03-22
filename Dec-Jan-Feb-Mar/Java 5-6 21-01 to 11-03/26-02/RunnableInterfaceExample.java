class MyThread implements Runnable {
    @Override
    public void run() {
        runLoop();
    }

    void runLoop() {
        for(int i=1; i<=10; i++) {
            System.out.println("MyThread class: " + i);
        }
    }
}

public class RunnableInterfaceExample {
    public static void main(String[] args) {
        MyThread m1 = new MyThread();
        Thread t1 = new Thread(m1);
        t1.start();

        for(int i=1; i<=10; i++) {
            System.out.println("main method: " + i);
        }
    }
}
