package com.devmind.course5;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Task {
    private String taskName;
    private Integer taskId;
    private Integer executionTime;
    private static Integer numberOfTasks = 0;
    private static Random random;

    public Task(){
        this.taskId = generateId();
        this.taskName = "Task" + taskId;
        numberOfTasks++;
        this.executionTime = new Random().nextInt(19) + 1;
    }

    public void run() throws InterruptedException {
        System.out.println("Sleep for " + executionTime + " seconds.");
        TimeUnit.SECONDS.sleep(executionTime);
        Thread.sleep(executionTime * 2000);
    }

    public Integer generateId(){
        random = new Random();
        return random.nextInt(100);
    }

    public void destroy(){
        System.out.println("Destroyed task " + taskName);
        numberOfTasks--;
    }

}
