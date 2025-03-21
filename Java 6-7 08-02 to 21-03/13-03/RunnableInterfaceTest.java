class Parent {
    void print() {

    }
}

class ThreadExample extends Parent implements Runnable {
    @Override
    public void run() {
        count();
    }

    void count() {
        for(int i=1; i<=10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

class MyThread extends Thread {
    StringBuffer sb;
    MyThread(StringBuffer sb) {
        this.sb = sb;
    }

    @Override
    public void run() {
        for(int i=1; i<=5; i++) {
            sb.append(Thread.currentThread().getName()).append(" ");
            System.out.println(sb);
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

public class RunnableInterfaceTest {
    public static void main(String[] args) {
        ThreadExample o1 = new ThreadExample();
        
        Thread t1 = new Thread(o1);
        t1.setName("my-thread-1");
        t1.start();

        Thread t2 = new Thread(o1);
        t2.setName("my-thread-2");
        t2.start();

        for(int i=1; i<=10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }

        // StringBuilder sb = new StringBuilder("Hello ");
        StringBuffer sb = new StringBuffer("Hello ");

        MyThread mt1 = new MyThread(sb);
        MyThread mt2 = new MyThread(sb);
        mt1.setName("first");
        mt2.setName("second");

        mt1.start();
        mt2.start();
    }
}