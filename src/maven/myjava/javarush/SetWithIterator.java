package javarush;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetWithIterator {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Iterator it = cats.iterator();
        if(it.hasNext()){
        cats.remove(it.next());
        }
        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> cats = new HashSet<Cat>();
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        for(Cat cat : cats){
            System.out.println(cat);
        }
    }

    public static class Cat {
        
    }
}
