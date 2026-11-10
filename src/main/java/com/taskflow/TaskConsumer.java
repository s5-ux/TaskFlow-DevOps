
package com.taskflow;

import java.util.concurrent.BlockingQueue;

public class TaskConsumer implements Runnable {

    private BlockingQueue<Task> taskQueue;

    public TaskConsumer(BlockingQueue<Task> taskQueue) {
        this.taskQueue = taskQueue;
    }

    @Override
    public void run() {

        while (true) {

            try {
                Task task = taskQueue.take();

                task.setStatus("COMPLETED");

                System.out.println(
                    "Consumed: " + task.getTaskName()
                    + " | Status: " + task.getStatus()
                );

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}
