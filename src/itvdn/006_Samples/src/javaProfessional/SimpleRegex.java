package javaProfessional;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Yevhenii Tykhonov.
 */
public class SimpleRegex {
    public static void main(String[] args) {
 //      Pattern p = Pattern.compile("[а-я]+\\s*[а-я]+", Pattern.CASE_INSENSITIVE|Pattern.UNICODE_CASE);
//        Pattern p = Pattern.compile("[а-яА-ЯієІЄЇї']+");
        //Matcher m = p.matcher("жыве беларусь");

 //       Pattern p = Pattern.compile("[a-z&&[^d]]+");
//      Matcher m = p.matcher("abc");


        Pattern p = Pattern.compile("[а-я&&[^ў]]+");
        Matcher m = p.matcher("вапрен");

//        Pattern p = Pattern.compile("[a-zA-Z]+\\s*[a-zA-Z]+");
//        Matcher m = p.matcher("Hello World");
        boolean b = m.matches();
        System.out.println(b);
    }
}
