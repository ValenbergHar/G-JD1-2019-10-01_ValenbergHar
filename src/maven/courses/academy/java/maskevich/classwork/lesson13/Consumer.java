package by.academy.java.maskevich.classwork.lesson13;
import java.util.Queue;

public class Consumer extends Thread {

    private static final int EMAIL_PROCESSING_PAUSE = 3000;

    private static final int NO_EMAIL_PAUSE = 10000;

    private Queue<Email> queue;

    public Consumer(Queue<Email> queue, String name) {
        super(name);
        this.queue = queue;
    }

    @Override
    public void run() {
        while (!Thread.interrupted()) {
            Email e;
            String threadName = getName();
            synchronized (queue) {
                e = queue.poll();
            }
            if (e == null) {
                if (Task.LIMIT_REACHED) {
                    Logger.printLine(String.format(
                            "%s  stopped because of reached limit of emails", threadName));
                    return;
                }

                try {
                    Thread.sleep(NO_EMAIL_PAUSE);
                } catch (InterruptedException e1) {
                    stopWork(true);
                    return;
                }
            } else {
                try {
                    Thread.sleep(EMAIL_PROCESSING_PAUSE);
                } catch (InterruptedException e1) {
                    stopWork(false);
                    return;
                }

                Logger.printLine(String.format("%s removed %s", threadName, e));
            }
        }
        stopWork(true);
    }

    private void stopWork(boolean completedLastEmail) {
        String threadName = getName();
        Logger.printLine(
                String.format("Redundant Consumer objects.queue size=%s. removed %s",
                        queue.size(), threadName));
    }
}