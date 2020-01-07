package javarush;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayListAddinTheBegin {
    public static void main(String[] args) throws Exception {
        ArrayList<String> l1 = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++)
        {
                l1.add(0, reader.readLine());
        }
        
        for (int i = 0; i < 10; i++)
        {
                System.out.println(l1.get(i));
        }
    }
}