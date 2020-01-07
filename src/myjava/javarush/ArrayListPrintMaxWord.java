package javarush;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayListPrintMaxWord {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        strings = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i<5; i++){
            strings.add(reader.readLine());
        }
        String m = " ";
        for(int i = 0; i<strings.size(); i++){
            if(m.length()<strings.get(i).length()){
                m=strings.get(i);
            }
        }
        
        for (int i = 0; i<strings.size(); i++) {
        	if (m.length()==strings.get(i).length()) {
        		System.out.println(strings.get(i));
        	}
        }
    }
}
