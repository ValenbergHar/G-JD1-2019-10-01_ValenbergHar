package by.academy.java.maskevich.classwork.lesson13.task2;
import java.util.concurrent.atomic.AtomicInteger;

public class Email {

    private static final int EMAIL_LIMIT = 50;

    private static AtomicInteger COUNTER = new AtomicInteger();

    private int number;

    public Email() {
        number = COUNTER.incrementAndGet();

        if (number == EMAIL_LIMIT) {
            Task.LIMIT_REACHED = true;
        }
    }

    @Override
    public String toString() {
        return "email#" + number;
    }
}