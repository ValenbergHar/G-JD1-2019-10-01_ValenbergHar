package javarush;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//Ввести с клавиатуры 10 строчек 
//и подсчитать в них количество различных 
//букв (для 33 маленьких букв алфавита). 
//Результат вывести на экран в алфавитном порядке.

public class StringFindLettersAmountInWord {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а','б','в','г','д','е','ё','ж',
                'з','и','й','к','л','м','н','о',
                'п','р','с','т','у','ф','х','ц',
                'ч','ш','щ','ъ','ы','ь','э','ю','я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }
int  count=0;
         for (char abs : alphabet) {
            for (String lonelyString : list) {
                for (char symbol : lonelyString.toCharArray()) {
                    if(abs == symbol)
                        count++;
//                    У нас есть строка "ABC". С помощью метода toCharArray() 
                 //   мы перевели эту строку в массив чаров {'A', 'B', 'C'}.
                }
            }
            System.out.println(abs + " " + count);
            count = 0;
        }
    }
}
