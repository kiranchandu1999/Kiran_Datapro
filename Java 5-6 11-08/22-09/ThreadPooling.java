import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable {
    int id;
    Task(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        Thread current = Thread.currentThread();
        System.out.println("Running task " + id + " on " + current.getName());
    }
}

public class ThreadPooling {
    public static void main(String[] args) {
        // Thread pooling using ExecutorService
        ExecutorService ex = Executors.newFixedThreadPool(3);
        
        for(int i=1; i<=10; i++) {
            ex.submit(new Task(i));
        }
        
        // executor shutdown
        ex.shutdown();
    }
}
