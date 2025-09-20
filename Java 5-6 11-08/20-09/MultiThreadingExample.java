// extending Thread class
class DemoThread extends Thread {
    @Override
    public void run() {
        print();
    }

    void print() {
        for(int i=1; i<=10; i++) {
            System.out.println("Demo method: " + i + " running on " + Thread.currentThread().getName());
        }
    }
}


class DemoParent {
    void runLoop() {
        for(int i=1; i<=10; i++) {
            System.out.println("Demo runnable method: " + i + " running on " + Thread.currentThread().getName());
        }
    }
}

// implementing Runnable interface
class DemoRunnable extends DemoParent implements Runnable {
    @Override
    public void run() {
        display();
    }

    void display() {
        System.out.println("DemoRunnable method started!!!");
        super.runLoop();
    }
}


class MultiThreadingExample {
    public static void main(String[] args) {
        // Thread object using Thread class
        DemoThread d1 = new DemoThread();
        d1.start();
        // d1.start(); // we can't start any thread again

        // Thread creation using Runnable
        DemoRunnable dr1 = new DemoRunnable();
        Thread th1 = new Thread(dr1);
        th1.start();

        for(int i=1; i<=10; i++) {
            System.out.println("Main method: " + i + " running on " + Thread.currentThread().getName());
        }
    }
}