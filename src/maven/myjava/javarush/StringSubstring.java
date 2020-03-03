package javarush;
public class StringSubstring {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";
for (int i = 0; i < 5; i++) {
            System.out.println(s.substring(i, i+3));
        }
//Метод substring() в Java имеет два варианта и возвращает новую 
//строку, которая является подстрокой данной строки. Подстрока 
//начинается с символа, заданного индексом, и продолжается до конца 
//данной строки или до endIndex-1, если введен второй аргумент. 
    }

}

