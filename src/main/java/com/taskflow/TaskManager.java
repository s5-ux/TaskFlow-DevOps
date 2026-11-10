
package com.taskflow;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class TaskManager {

    public static void main(String[] args) {

        BlockingQueue<Task> taskQueue =
                new LinkedBlockingQueue<>();

        TaskProducer producer =
                new TaskProducer(taskQueue);

        TaskConsumer consumer =
                new TaskConsumer(taskQueue);

        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();

        try {
            producerThread.join();

            consumerThread.interrupt();

            consumerThread.join();

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("All tasks processed!");
    }
}
