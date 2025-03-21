class Example extends Thread {
    @Override
    public void run() {
        runLoop();
    }

    void runLoop() {
        for(int i=1; i<=10; i++) {
            System.out.println("Example class: " + Thread.currentThread().getName() + " " + i);
        }
    }
}

class Parent {
    void m1() {
        for(int i=1; i<=10; i++) {
            System.out.println("m1 method: " + Thread.currentThread().getName() + " " + i);
        }
    }

    void m2() {

    }
}

class Child extends Parent implements Runnable {

    public void run() {
        m1();
    }

    void m3() {

    }
}

public class MultiThreadingExample {
    public static void main(String[] args) {
        Example e1 = new Example();
        // calling method inside Example class using first thread
        e1.setName("first-thread");
        e1.start();

        // second thread
        Child c1 = new Child();
        Thread t1 = new Thread(c1);
        t1.start();

        // running loop in main method
        for(int i=1; i<=10; i++) {
            System.out.println("Main method: " + Thread.currentThread().getName() + " " + i);
        }
        
    }
}