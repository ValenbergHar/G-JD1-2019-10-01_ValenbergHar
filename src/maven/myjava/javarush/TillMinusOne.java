package javarush;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TillMinusOne {
    public static void main(String[] args) throws Exception {
 BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int a = 0; // 
        double res = 0; // 
        double sum = 0; // 
        int i = 1; // 
        for (i = 1; a != -1; i++) // 
        { 	a = Integer.parseInt(buf.readLine()); //
            sum += a; // 
        }
        res = (sum+1) / (i - 2); //  
        System.out.println(res); //
    }
}