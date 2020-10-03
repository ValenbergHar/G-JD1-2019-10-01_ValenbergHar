package javaProfessional.ex_004_set.hashSet;

import java.util.*;

public class Main {
    public static void main(String[] args){
        // Создаем коллекцию хэш-сет
        Set<String> set = new TreeSet<>();
        //Set<String> set = new LinkedHashSet<>();
        set.add("арбуз");
        set.add("банан");
        set.add("дыня");
        set.add("земляника");
        set.add("ирис");
        set.add("картофель");
        for (String text : set) {
            System.out.println(text + " " + text.hashCode());
        }
    }
}
