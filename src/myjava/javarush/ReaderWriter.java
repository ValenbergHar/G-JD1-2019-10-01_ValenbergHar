package javarush;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

//Прочесть с консоли имя файла.
//2. Считывать строки с консоли, пока 
//пользователь не введет строку "exit".
//3. Вывести абсолютно все введенные 
//строки в файл, каждую строчку с новой строки.

public class ReaderWriter {
   public static void main(String[] args)  throws IOException {

       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        BufferedWriter writer = null;
        try
        {
            writer = new BufferedWriter(new FileWriter(fileName));
            while(true)
            {
                String text = reader.readLine();
                if (text.equals("exit"))
                {
                    writer.write(text);
                    break;
                }
                writer.write(text);
                writer.newLine();
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        finally {
            reader.close();
            writer.close();
        }
    }
}