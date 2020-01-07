package javarush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayListVeryBigLittle {
    public static void main(String[] args) throws IOException {
         ArrayList<String> strings = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++)
        {
                strings.add(reader.readLine());
        }
        int idMin = 0;
        int idMax = 0;
        String min = " ";
        for(int i = 0; i<strings.size(); i++){
            if(min.length()<strings.get(i).length()){
                min=strings.get(i);
                idMin = i;
            }
        }
         int max = strings.get(0).length();
        for (int i = 1; i < strings.size();i++)
        {
                if (max > strings.get(i).length()){
                        max = strings.get(i).length();
                        idMax = i;
                }
        }
        
        if (idMin < idMax){
            System.out.println(strings.get(idMin));
        }else{
            System.out.println(strings.get(idMax));
        }
        
        
        
    }
}
