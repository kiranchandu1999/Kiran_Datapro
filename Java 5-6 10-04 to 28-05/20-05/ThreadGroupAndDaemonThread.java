public class ThreadGroupAndDaemonThread {
    public static void main(String[] args) {
        // we can assign group to threads by creating ThreadGroup
        ThreadGroup group = new ThreadGroup("group-1");

        // anonymous class
        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread - " + Thread.currentThread().getName() + " Group - " + Thread.currentThread().getThreadGroup().getName());
                // try {
                //     Thread.sleep(2000);
                // }
                // catch(InterruptedException e) {
                //     e.printStackTrace();
                // }
            }
        };

        Thread t1 = new Thread(group, task, "My Thread -1");
        Thread t2 = new Thread(group, task, "My Thread -2");

        t1.start();
        t2.start();

        System.out.println("Available threads in the group: " + group.activeCount());


        // Daemon thread demo
        Thread daemon = new Thread(() -> {
            int id = 1;
            while(true) {
                System.out.println("Daemon Thread running: " + id);
                id++;
            }
        });
        daemon.setDaemon(true);
        System.out.println(daemon.isDaemon());

        daemon.start();

        // sleeping main thread for some time, to see daemon thread running
        try {
            Thread.sleep(2000);
        }
        catch(InterruptedException e) {}
    }
}
