class Parent {

}

class CustomThread1 extends Parent implements Runnable {
    public void run() {
        runLoop();
    }

    void runLoop() {
        for(int i=1; i<=10; i++) {
            System.out.println("my thread " + i + " " + Thread.currentThread().getName() + Thread.currentThread().isAlive());
            try {
                Thread.sleep(500);
            }
            catch(Exception e){}
        }
    }
}

public class RunnableInterfaceTest {
    public static void main(String[] args) {
        CustomThread1 c1 = new CustomThread1();
        Thread t1 = new Thread(c1);
        t1.setName("thread-1");
        t1.setPriority(2);
        t1.start();

        for(int i=1; i<=10; i++) {
            System.out.println("main " + i + " " + Thread.currentThread().getName() + Thread.currentThread().getPriority());
            try {
                Thread.sleep(500);
            }
            catch(Exception e){}
        }
    }
}