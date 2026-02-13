class Demo extends Thread {
    @Override
    public void run() {
        print();
    }

    void print() {
        System.out.println(Thread.currentThread().getName() + ", " + Thread.currentThread().getPriority());
        for(int i=1; i<=10; i++) {
            System.out.println("Demo class: " + i + " on " + Thread.currentThread().getName());
            if(i == 5) {
                try {
                    Thread.sleep(2000);
                }
                catch(InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }
}

class DemoParent {
    void runLoop() {
        for(int i=1; i<=10; i++) {
            System.out.println("DemoParent class: " + i + " on " + Thread.currentThread().getName());
            if(i == 5) {
                try {
                    Thread.sleep(2000);
                }
                catch(InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }
}

class DemoRunnable extends DemoParent implements Runnable {
    @Override
    public void run() {
        printLoop();
    }

    void printLoop() {
        System.out.println(Thread.currentThread().getName() + ", " + Thread.currentThread().getPriority());
        super.runLoop();
    }
}

class MultiThreading {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        // d1.run(); // it won't create new thread
        d1.setName("MyThread-1");
        d1.setPriority(Thread.MIN_PRIORITY);
        d1.start();
        // d1.start(); // we can't start thread multiple times

        Demo d2 = new Demo();
        d2.setPriority(Thread.MAX_PRIORITY);
        d2.start();


        // Thread using Runnable
        DemoRunnable dr1 = new DemoRunnable();
        // dr1.start();
        Thread t1 = new Thread(dr1);
        t1.start();

        for(int i=1; i<=10; i++) {
            System.out.println("Main class: " + i + " on " + Thread.currentThread().getName());
        }
    }
}