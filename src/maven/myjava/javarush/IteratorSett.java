package javarush;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorSett {
    public static Set<Integer> createSet() {
        Set<Integer> numb = new HashSet<Integer>();
         for (int i = 0; i<20; i++){
      numb.add(i);
} return numb;

    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
       Iterator<Integer> it = set.iterator();
       while(it.hasNext()){
           if (it.next()>10) it.remove();
       }
       
       return set;

    }

    public static void main(String[] args) {

    }
}