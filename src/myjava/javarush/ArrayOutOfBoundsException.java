package javarush;

import java.io.BufferedReader;


import java.io.InputStreamReader;
import java.util.ArrayList;

//Создать список целых чисел.
//Ввести с клавиатуры 20 целых чисел.
//Создать метод по безопасному извлечению чисел из списка:

public class ArrayOutOfBoundsException
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++)
        {
            int x = Integer.parseInt(reader.readLine());
            list.add(x);
        }

        System.out.println(safeGetElement(list, 5, 1));
        System.out.println(safeGetElement(list, 20, 7));
        System.out.println(safeGetElement(list, -5, 9));
    }

    public static int safeGetElement(ArrayList<Integer> list, int index, int defaultValue)
    {
      //Напишите тут ваш код
        int value;
        try
        {
            value = list.get(index);
        }
        catch (Exception e)
        {
            value = defaultValue;
        }
        return value;
    }

}