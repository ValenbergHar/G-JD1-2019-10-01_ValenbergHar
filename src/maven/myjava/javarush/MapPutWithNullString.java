package javarush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MapPutWithNullString {
    public static void main(String[] args) throws IOException {
        {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, String> map = new HashMap<String, String>(); 
        while (true)
        {
            String sity1 = reader.readLine();
            if (sity1.isEmpty())
                break;
            else {
                String lastName = reader.readLine();
                map.put(sity1, lastName);
            }
        }

        String cityKeyboard = reader.readLine(); 

        for (Map.Entry<String, String> pair : map.entrySet())
        {
            if (pair.getKey().equals(cityKeyboard))
                System.out.println(pair.getValue());
        }
    }
    }
}
