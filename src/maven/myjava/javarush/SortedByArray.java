package javarush;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class SortedByArray {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> m=new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i =0; i<10; i++){
        m.add(Integer.parseInt(reader.readLine()));
        }
        Collections.sort(m);
        for(Integer temp: m){
            System.out.println(temp);
        }
    }
}