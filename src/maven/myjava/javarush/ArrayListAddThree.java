package javarush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayListAddThree {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 3; i++)
        {
                list.add(Integer.parseInt(reader.readLine()));
        }
        for (int i = list.size()-1; i >=0; i--)
        {
                System.out.println(list.get(i));
        }
        
    }
}