package by.academy.java.maskevich.classwork.lesson13.task2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Task {
    public static boolean LIMIT_REACHED = false;

    private static final int CHECK_BALANCE_DELAY = 10000;

    private static final Queue<Email> queue = new LinkedList<>();

    private static List<Producer> PRODUCERS = new ArrayList<>();
    private static List<Consumer> CONSUMERS = new ArrayList<>();

    private static void startProducer() {
        int nextNumber = PRODUCERS.size() + 1;
        Producer producer = new Producer(queue, "Producer#" + nextNumber);
        PRODUCERS.add(producer);
        producer.start();

    }

    private static void startConsumer() {
        int nextNumber = CONSUMERS.size() + 1;
        Consumer consmer = new Consumer(queue, "Consumer#" + nextNumber);
        CONSUMERS.add(consmer);
        consmer.start();

        Logger.printLine(String.format(
                "not enough Consumer objects. queue size=%s. Added %s",
                queue.size(), consmer.getName()));
    }

    public static void main(String[] args) throws InterruptedException {
        startProducer();
        startProducer();

        startConsumer();

        while (true) {
            if (LIMIT_REACHED) {
                Logger.printLine(
                        String.format("%s stopped because of reached limit of emails",
                                Thread.currentThread().getName()));
                return;
            }

            if (queue.size() > 20) {
                startConsumer();
            } else if (queue.size() < 10 && CONSUMERS.size() > 1) {
                int lastIndex = CONSUMERS.size() - 1;
                Consumer consumer = CONSUMERS.get(lastIndex);
                consumer.interrupt();
            }
            Thread.sleep(CHECK_BALANCE_DELAY);
        }
    }
}