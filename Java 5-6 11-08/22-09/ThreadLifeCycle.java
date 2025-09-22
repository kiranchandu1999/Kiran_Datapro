class LifeThread extends Thread {
    @Override
    public void run() {
        Thread current = Thread.currentThread();
        // RUNNING STATE
        System.out.println("Thread name: " + current.getName());
        System.out.println("state 2: " + current.getState());
        for(int i=1; i<=5; i++) {
            System.out.println("Life thread " + i);
            if(i==3) {
                try {
                    System.out.println("state 3: " + current.getState());
                    Thread.sleep(2000);
                    System.out.println("state 4: " + current.getState());
                }
                catch(InterruptedException ie) {
                    System.out.println(ie);
                }
            }
        }
    }
}

class ThreadLifeCycle {
    public static void main(String[] args) {
        LifeThread t1 = new LifeThread(); // NEW STATE
        t1.setName("LifeThread-1");
        t1.setPriority(Thread.MAX_PRIORITY); // 10
        System.out.println(t1.getPriority());
        System.out.println("State 1: " + t1.getState());
        t1.start(); // RUNNABLE STATE

        try {
            t1.join();
        }
        catch(InterruptedException ie) {
            System.out.println(ie);
        }
        System.out.println("State 5: " + t1.getState()); // TERMINATED STATE
    }
}