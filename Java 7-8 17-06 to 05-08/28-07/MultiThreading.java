class Demo extends Thread {
    @Override
    public void run() {
        print();
    }

    void print() {
        for(int i=1; i<=10; i++) {
            System.out.println("Demo class method: " + Thread.currentThread().getName() + i);
            if(i == 5) {
                try {
                    Thread.sleep(2000);
                }
                catch(Exception e) {
                    System.out.println(e);
                }
            }
        }
    }
}

class Demo2 implements Runnable {
    @Override
    public void run() {
        print();
    }

    void print() {
        for(int i=1; i<=10; i++) {
            System.out.println("Demo class method: " + Thread.currentThread().getName() + i);
            if(i == 5) {
                try {
                    Thread.sleep(2000);
                }
                catch(Exception e) {
                    System.out.println(e);
                }
            }
        }
    }
}

class MultiThreading {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        d1.setName("DemoThread-1");
        // d1.print();
        d1.start();
        // d1.start(); // we cannot start same thread multiple times

        Demo d2 = new Demo();
        d2.setPriority(Thread.MAX_PRIORITY);
        d2.start();

        // Thread creation using Runnable
        Demo2 dr1 = new Demo2();
        Thread t1 = new Thread(dr1);
        t1.start();

        System.out.println("DemoThread1 priority: " + d1.getPriority());

        for(int i=1; i<=5; i++) {
            System.out.println("Main method: " + Thread.currentThread().getName() + i);
        }
    }
}