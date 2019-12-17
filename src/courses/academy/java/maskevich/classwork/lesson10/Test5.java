package by.academy.java.maskevich.classwork.lesson10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test5 {

	public static void main(String[] args) {
		Set<String> words = new HashSet<String>();
		words.add("One");
		words.add("Two");
		words.add("Three");
		words.add("Fore");
		Iterator<String> iterator = words.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		

	}

}
