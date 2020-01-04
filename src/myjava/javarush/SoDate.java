package javarush;
import java.util.Date;
import java.text.*;

public class SoDate {
    public static void main(String[] args) {
        Date dateNow = new Date();
      SimpleDateFormat formatForDateNow = new SimpleDateFormat("dd MM yyyy");

      System.out.println(formatForDateNow.format(dateNow));
    }
}
