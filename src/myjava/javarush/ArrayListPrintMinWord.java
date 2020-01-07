package javarush;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayListPrintMinWord {
    public static void main(String[] args) throws Exception {
        ArrayList<String> l1 = new ArrayList<String>();
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //¬вожу 5 строк с клавы
        for (int i = 0; i < 5; i++)
        {
                l1.add(reader.readLine());
        }

        int maxL = l1.get(0).length();
        for (int i = 1; i < l1.size();i++)
        {
                if (maxL > l1.get(i).length()){
                        maxL = l1.get(i).length();
                }
        }

        for (int i = 0; i < l1.size();i++){
                if (l1.get(i).length() > maxL) {
                        l1.remove(i);
                    i = i -1;
                }
        }
        for (int i = 0; i < l1.size(); i++)
        {
                System.out.println(l1.get(i));
        }
    }
}
