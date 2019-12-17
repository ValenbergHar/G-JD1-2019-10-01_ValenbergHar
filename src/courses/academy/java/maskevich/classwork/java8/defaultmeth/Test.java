package by.academy.java.maskevich.classwork.java8.defaultmeth;

import java.util.Arrays;
import java.util.function.Consumer;

public class Test {

	public static void main(String[] args) {
//		Arrays.asList("a", "b", "d").forEach(new Consumer<String>() {
//
//			@Override
//			public void accept(String e) {
//				System.out.println(e);
//			}
//		});

		Arrays.asList("a", "b", "d").forEach(e -> System.out.println(e));
	}
	
	

}
