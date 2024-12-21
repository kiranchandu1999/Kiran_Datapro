class Myclass extends Thread {
    public void run() {
        count();
    }

    void count() {
        try {
            for(int i=1; i<=100; i++) {
                System.out.println("myclass " + i);
                // Thread.sleep(500);
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(Thread.currentThread().getPriority());
    }
}

public class ExtendingThreadClass {
    public static void main(String[] args) {
        Myclass ob1 = new Myclass();
        ob1.start();

        try {
            for(int i=1; i<=100; i++) {
                System.out.println("main " + i);
                // Thread.sleep(500);
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
        
        System.out.println(Thread.currentThread().getName());
    }
}
