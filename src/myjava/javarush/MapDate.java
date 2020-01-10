package javarush;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class MapDate {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));

        map.put("Дима", new Date("JUNE 28 1984"));
        map.put("Вадим", new Date("APR 29 1992"));
        map.put("Мама", new Date("DEC 11 1959"));
        map.put("Сталлоне1", new Date("JUNE 9 1980"));
        map.put("Сталлоне2", new Date("JUNE 5 1980"));
        map.put("Сталлоне3", new Date("JUNE 28 1980"));
        map.put("Сталлоне4", new Date("JUNE 2 1980"));
        map.put("Сталлоне5", new Date("JUNE 4 1980"));
        map.put("Сталлоне6", new Date("JUNE 6 1980"));
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String,Date> pair = iterator.next();
            Date value = pair.getValue();
            int m = value.getMonth();
            if(m == 5 || m == 6 || m == 7)
                iterator.remove();
        }

    }
}