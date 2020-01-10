package javarush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LettersInSentToUpperCase {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
         String[] test =  string.trim().split("\\s+");
    for (int i = 0; i < test.length; i++)
{
        System.out.print(test[i].substring(0, 1).toUpperCase() + test[i].substring(1) + " ");
    }
     
    }
}
