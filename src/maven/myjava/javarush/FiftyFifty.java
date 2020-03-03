package javarush;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FiftyFifty {
    public static void main(String[] args) throws Exception {
        int[] m = new int[20];
         int[] m1 = new int[10];
         int[] m2 = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
          for (int i =0; i<20; i++){
         m[i] = Integer.parseInt(reader.readLine());
        }
        
        for (int i =0; i<5; i++){
         m1[i] = m[i];
        
  }
        for (int i =0; i<10; i++){
         m2[i] = m[i+10];
        System.out.println(m2[i]) ;
}
//        for (int i =0; i<0; i++){
//          System.out.println(m2[i]) ;
//        }
        
    }
}
