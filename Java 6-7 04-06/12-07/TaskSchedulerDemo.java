import java.util.LinkedList;

class TaskScheduler {
    LinkedList<String> tasks = new LinkedList<>();

    void addTask(String task) {
        tasks.add(task); // or addLast(task);
    }

    void addUrgentTask(String task) {
        tasks.addFirst(task);
        // tasks.set(2, task);
    }

    void processTask() {
        System.out.println("Processing task: " + tasks.removeFirst());
    }

    void showTasks() {
        System.out.println("Tasks list: " + tasks);
    }
}

public class TaskSchedulerDemo {
    public static void main(String[] args) {
        TaskScheduler ts = new TaskScheduler();
        ts.addTask("print resume");
        ts.addTask("write document");
        ts.addUrgentTask("prepare resume");
        ts.showTasks();
        ts.processTask();
        ts.processTask();
        ts.processTask();
    }
}
