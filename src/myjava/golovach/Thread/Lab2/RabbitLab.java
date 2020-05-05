package golovach.Thread.Lab2;

/**
 * Created by AdminAccount on 03.12.2015.
 */
public class RabbitLab {
    public static int num = 0;
    public static void main(String[] args) {
        new Thread(new RabbitPrinter()).start();
    }
}
