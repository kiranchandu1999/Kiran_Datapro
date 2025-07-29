import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable {
    int id;
    Task(int id) {
        this.id = id;
    }
    @Override
    public void run() {
        System.out.println("Task - " + id + " on Thread - " + Thread.currentThread().getName());
    }
}

public class ThreadPooling {
    public static void main(String[] args) {
        // we can create thread pool by using Executors of java concurrency package
        ExecutorService ex = Executors.newFixedThreadPool(3);

        // submit different tasks to exectorService
        for(int i=1; i<=10; i++) {
            ex.submit(new Task(i));
        }

        // using lamda
        // for(int i=1; i<=10; i++) {
        //     int taskId = i;
        //     ex.submit(() -> {
        //         System.out.println("Task - " + taskId + " on Thread - " + Thread.currentThread().getName());
        //     });
        // }

        // after shutting down, executor Service won't take any new tasks
        ex.shutdown();
    }
}
