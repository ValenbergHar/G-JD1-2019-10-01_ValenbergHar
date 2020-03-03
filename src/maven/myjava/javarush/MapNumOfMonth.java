package javarush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MapNumOfMonth {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> month = new HashMap<>();

        month.put("January", 1);
        month.put("February", 2);
        month.put("March", 3);
        month.put("April", 4);
        month.put("May", 5);
        month.put("June", 6);
        month.put("July", 7);
        month.put("August", 8);
        month.put("September", 9);
        month.put("October", 10);
        month.put("November", 11);
        month.put("December", 12);


        String yourMonth = reader.readLine();
        
        for (Map.Entry<String, Integer> pair : month.entrySet()) {
            String key = pair.getKey();
            Integer value = pair.getValue();
            if (key.equals(yourMonth)) {
                System.out.println(key + " is the " + value + " month");
            }
        }
    }
}