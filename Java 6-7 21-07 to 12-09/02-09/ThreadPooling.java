import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable {
    int id;

    Task(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Task " + id + " running on thread: " + Thread.currentThread().getName());
    }
}

public class ThreadPooling {
    public static void main(String[] args) {
        ExecutorService ex = Executors.newFixedThreadPool(3);

        for(int i=1; i<=10; i++) {
            ex.submit(new Task(i));
        }

        // closing the executor service
        ex.shutdown();
    }
}
