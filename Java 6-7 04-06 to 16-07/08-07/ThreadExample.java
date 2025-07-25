class MyThread extends Thread {
    @Override
    public void run() {
        print();
    }

    void print() {
        System.out.println("MyThread class-thread: " + Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        }
        catch(InterruptedException ie) {}
        System.out.println("Printing from MyThread class..");
    }

    void showData() {
        System.out.println("Showing data from MyThread");
    }
}

class RunnableThread implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable thread: " + Thread.currentThread().getName());
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        System.out.println("Program start...");

        MyThread mt1 = new MyThread();
        mt1.setName("MyThread-1");
        mt1.start();

        MyThread mt2 = new MyThread();
        mt2.start();

        // Thread created using Runnable
        RunnableThread obj1 = new RunnableThread();
        Thread mt3 = new Thread(obj1);
        mt3.start();

        System.out.println("main method thread: " + Thread.currentThread().getName());

        System.out.println("Program end...");
    }
}
