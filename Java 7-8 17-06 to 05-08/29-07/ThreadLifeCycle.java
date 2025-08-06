class DemoThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread name: " + Thread.currentThread().getName());
        try{
            Thread.sleep(2000);
            System.out.println("Thread state: " + Thread.currentThread().getState());
        } catch(InterruptedException ie) {}
        System.out.println("Finished state: " + Thread.currentThread().getState());
    }
}

public class ThreadLifeCycle {
    public static void main(String[] args) {
        DemoThread t1 = new DemoThread();
        t1.setName("Demo Thread - 1");
        t1.setPriority(Thread.MIN_PRIORITY);
        System.out.println(t1.getPriority());
        System.out.println("State after thread creation: " + t1.getState());

        t1.start();
        System.out.println("After starting thread: " + t1.getState());

        try{
            t1.join();
        } catch(InterruptedException ie) {
            System.out.println(ie);
        }
        
        System.out.println("After t1 joining to main thread: " + t1.getState());
    }
}
