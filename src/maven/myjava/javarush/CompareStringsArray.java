package javarush;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CompareStringsArray {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }
        sort(array);
        for (String word : array) {
            System.out.println(word);
        }
    }
    public static void sort(String[] array) {
        
        String st = null;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (isGreaterThan(array[j], array[i]))
                {
                    st = array[i];
                    array[i] = array[j];
                    array[j] = st;
                }
            }
        }
    }
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }
}