package by.academy.java.maskevich.classwork.lesson13.task2;
import java.util.Queue;
import java.util.Random;

public class Producer extends Thread {
    private static final Random RND = new Random();

    private Queue<Email> queue;

    public Producer(Queue<Email> queue, String name) {
        super(name);
        this.queue = queue;
    }

    @Override
    public void run() {
        String threadName = getName();
        while (true) {
            if (Task.LIMIT_REACHED) {
                Logger.printLine(String.format(
                        "%s stopped because of reached limit of emails", threadName));
                return;
            }

            int count = RND.nextInt(2) + 1;

            for (int i = 0; i < count; i++) {
                Email e = new Email();
                queue.add(e);

                Logger.printLine(String.format("%s created %s", threadName, e));
            }

            int pause = (RND.nextInt(2) + 3) * 1000;
            try {
                Thread.sleep(pause);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}