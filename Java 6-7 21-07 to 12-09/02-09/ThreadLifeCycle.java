class LifeThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread state 3: " + Thread.currentThread().getState());
        for(int i=1; i<=5; i++) {
            System.out.println("LifeThread: " + i);
            if(i==3) {
                try {
                    Thread.sleep(2000);
                    System.out.println("Thread state 4: " + Thread.currentThread().getState());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class ThreadLifeCycle {
    public static void main(String[] args) {
        LifeThread t1 = new LifeThread();
        System.out.println("Thread state 1: " + t1.getState());
        t1.start();
        System.out.println("Thread state 2: " + t1.getState());

        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread state 5: " + t1.getState());
    }
}