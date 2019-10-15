package Classwork.lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Test2 {

	public static void main(String[] args) throws IOException {
		System.out.println("input count of numbers: ");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(reader.readLine());

		int[] array = new int[count];

		Random random = new Random();
		for (int i = 0; i < count; i++) {
		array[i] = random.nextInt(9);
		}

		System.out.println("single line numbers: ");
		for (int i = 0; i < array.length; i++) {
		System.out.print(array[i]);
		}

		System.out.println();

		System.out.println("new line numbers: ");
		for (int i = 0; i < array.length; i++) {
		System.out.println(array[i]);
		}
		}
}
