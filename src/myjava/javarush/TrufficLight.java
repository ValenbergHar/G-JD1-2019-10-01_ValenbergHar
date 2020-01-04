package javarush;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TrufficLight {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      String s = reader.readLine();
      double d = Double.parseDouble(s);	
      
      d=d%5;
      System.out.println(d);
      if (d>=0 && d<3){
          System.out.println("зелёный"); 
      } else if (d>=3 && d<4){
          System.out.println("жёлтый"); 
      }else if (d>=4 && d<5){
           System.out.println("красный"); 
      }else {
           System.out.println("зелёный"); 
      }
    }
}