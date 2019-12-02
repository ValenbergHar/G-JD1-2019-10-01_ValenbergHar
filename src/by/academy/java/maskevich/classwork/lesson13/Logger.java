package by.academy.java.maskevich.classwork.lesson13;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {

    private static final DateFormat DF = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

    public static void printLine(String message) {
        System.out.printf("%s - %s\n", DF.format(new Date()), message);
    }

}