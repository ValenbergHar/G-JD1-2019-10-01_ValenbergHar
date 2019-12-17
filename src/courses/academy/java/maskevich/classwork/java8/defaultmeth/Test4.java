package by.academy.java.maskevich.classwork.java8.defaultmeth;

import java.util.Arrays;

public class Test4 {

	public static void main(String[] args) {
		int multiplier = 4;
		Arrays.asList(1, 2, 3, 4, 5).forEach(e -> System.out.println(e * multiplier));

	}
}
