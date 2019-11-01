
package by.academy.java.maskevich.classwork.lesson041;

import java.util.Random;

public class Test13 {
	// генерация чисел рефакторнинг - изменеине кода

	public static void main(String[] args) {
		int[] array = new int[10];
		Random rand = new Random();
		extracted(array, rand);
		System.out.println("initial array:");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			array[i] += 10;
		}
		System.out.println("new array:");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	private static void extracted(int[] array, Random rand) {
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(10);
		}
	}
}
