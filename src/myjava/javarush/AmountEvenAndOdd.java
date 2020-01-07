package javarush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AmountEvenAndOdd {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Integer i = Integer.parseInt(reader.readLine());
		
		while (i>0){
		    if (i%2==0){
		    	even+=1; 
		    }else{
		    	odd+=1;
		    }
		    i=i/10;
		}
		System.out.println("Even: " + even + " Odd: " + odd);
		
    }
}