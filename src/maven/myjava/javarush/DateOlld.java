package javarush;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateOlld {

    public static void main(String[] args) throws Exception {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        Date date = new Date();
        String[] splitedStr = s.split("-");
        int year = Integer.parseInt(splitedStr[0])-1900;
        int month = Integer.parseInt(splitedStr[1]);
        int day = Integer.parseInt(splitedStr[2]);

        date.setYear(year);
        date.setMonth(month-1);
        date.setDate(day);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        String finalDate = simpleDateFormat.format(date);
        String upper = finalDate.toUpperCase();
        System.out.println(upper);
    }
}