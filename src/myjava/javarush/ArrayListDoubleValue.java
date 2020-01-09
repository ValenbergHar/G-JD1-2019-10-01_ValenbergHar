package javarush;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayListDoubleValue {
    public static void main(String[] args) throws Exception {
         ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         for (int i = 0; i < 3; i++)
        {
                list.add(reader.readLine());
        }
         

        ArrayList<String> result = doubleValues(list);

         for (int i = 0; i < result.size(); i++)
                        {
                                System.out.println(result.get(i));
                        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
         ArrayList listd = new ArrayList();
                        for (int i = 0; i < list.size(); i++)
                        {
                                listd.add(list.get(i));
                                listd.add(list.get(i));
                        }               
               
                return listd;
    }
}
