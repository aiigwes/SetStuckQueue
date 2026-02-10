import java.util.ArrayDeque;

public class TaskScheduler {
    static ArrayDeque<String> tasks = new ArrayDeque<>();

    static void addTask(String task, boolean highPriority) {
        if (highPriority)
            tasks.addFirst(task);
        else
            tasks.addLast(task);
    }

    static void processTask() {
        String t = tasks.pollFirst();
        if (t != null)
            System.out.println("You need to do: " + t);
        else
            System.out.println("You have no business to do, just chill bro :)");
    }

    public static void main(String[] args) {
        addTask("Programming homework", true);
        addTask("Wash the dishes", false);
        addTask("Take a showrr", false);

        processTask();
        processTask();
        processTask();
    }
}
