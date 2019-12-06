package by.academy.java.maskevich.classwork.anclass;

import java.util.Arrays;
import java.util.List;

public class Lambda {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		numbers.forEach(number -> System.out.println(number));
	}
}
