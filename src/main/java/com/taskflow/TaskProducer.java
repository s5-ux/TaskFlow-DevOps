
package com.taskflow;

import java.util.concurrent.BlockingQueue;

public class TaskProducer implements Runnable {

    private BlockingQueue<Task> taskQueue;

    public TaskProducer(BlockingQueue<Task> taskQueue) {
        this.taskQueue = taskQueue;
    }

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            Task task = new Task(i, "Task-" + i);

            try {
                taskQueue.put(task);

                System.out.println(
                    "Produced: " + task.getTaskName()
                );

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}
