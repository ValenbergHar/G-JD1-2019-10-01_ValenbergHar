package javarush;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class matr {
    public static void main(String[] args) throws Exception {
        int[] m = new int[3];
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       for (int i =0; i<m.length; i++){
       m[i] = Integer.parseInt(reader.readLine());
       }
       int count =0;
       for(int i =0; i<m.length; i++){
           if (m[i]>0)
           count++;
       }
       System.out.println(count);

    }
}