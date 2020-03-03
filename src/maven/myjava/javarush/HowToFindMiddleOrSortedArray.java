package javarush;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class HowToFindMiddleOrSortedArray {
    public static void main(String[] args) throws Exception {
        int m[] = new int[3];
        for (int i =0; i< 3; i++){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       m[i] = Integer.parseInt(reader.readLine());
    }
    Arrays.sort(m, 0,2);
    System.out.println(m[1]);
    }
}