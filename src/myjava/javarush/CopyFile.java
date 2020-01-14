package javarush;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        InputStream fileInputStream = null;
        OutputStream fileOutputStream = null;
        try {

            String sourceFileName = reader.readLine();
            String destinationFileName = reader.readLine();

            fileInputStream = getInputStream(sourceFileName);
            fileOutputStream = getOutputStream(destinationFileName);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не существует.");
        }
        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }

    public static InputStream getInputStream(String fileName) throws IOException {
        return new FileInputStream(fileName);
    }

    public static OutputStream getOutputStream(String fileName) throws IOException {
        return new FileOutputStream(fileName);
    }
}

//Задача: Программа вводит два имени файла. И копирует первый файл на место, 
//заданное вторым именем.
//Новая задача: Программа вводит два имени файла. И копирует первый файл на место, 
//заданное вторым именем.
//Если файла (который нужно копировать) с указанным именем не существует, то программа должна 
//вывести надпись "Файл не существует." и еще один раз прочитать имя файла с консоли,
//а уже потом считывать файл для записи.

