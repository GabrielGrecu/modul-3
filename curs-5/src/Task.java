public class Task {
    private String taskName;
    private Integer taskId;
    private Integer executionTime;
    private static int numberOfTasks = 0;

    // Constructor
    public Task(String taskName, Integer executionTime) {
        this.taskName = taskName;
        this.executionTime = executionTime;
        this.taskId = generateId();
    }

    // Metoda care simulează execuția task-ului
    public void run() {
        System.out.println("Executing task: " + taskName);
        try {
            Thread.sleep(executionTime * 1000); // Convertim secundele în milisecunde
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Task completed: " + taskName);
    }

    // Metoda care generează un ID unic pentru fiecare instanță de Task
    private synchronized static Integer generateId() {
        return numberOfTasks++;
    }

    // Getter pentru taskId
    public Integer getTaskId() {
        return taskId;
    }

    // Getter pentru numberOfTasks
    public static int getNumberOfTasks() {
        return numberOfTasks;
    }
}
