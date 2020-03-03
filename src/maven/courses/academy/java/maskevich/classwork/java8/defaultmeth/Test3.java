package by.academy.java.maskevich.classwork.java8.defaultmeth;

import java.util.Arrays;
import java.util.Comparator;

public class Test3 {

	public static void main(String[] args) {
		Arrays.asList("a", "b", "d").sort((e1, e2) -> e1.compareTo(e2));

		Arrays.asList("a", "b", "d").sort((e1, e2) -> {
			int result = e1.compareTo(e2);
			return result;

		});

	}

}
