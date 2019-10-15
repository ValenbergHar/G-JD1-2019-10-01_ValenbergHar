package by.academy.java.maskevich.Classwork.lesson4;

import java.util.Arrays;

public class sortmassive {
	// https://stackoverflow.com/questions/1694751/java-array-sort-descending обратная сортировка
	public static void main(String[] args) {
		int[] array = {2,7,6,3,0,1};
		Arrays.sort(array);
		for (int element: array) {
			System.out.println(element +" ");
		}

	}

}
