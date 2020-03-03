package javarush;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ArrayBubble {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int[] array = new int[20];
		for (int i = 0; i < 20; i++) {
			array[i] = Integer.parseInt(reader.readLine());
		}

		sort(array);

		for (int x : array) {
			System.out.println(x);
		}
	}

	public static void sort(int[] array) {
		{
			// Напишите тут ваш код
			int buf;

			for (int i = 0; i < array.length; i++) {
//Сортируем методом пузрька
				for (int j = 0; j < array.length; j++) {
					if (array[i] > array[j]) {
						buf = array[j];
						array[j] = array[i];
						array[i] = buf;
					}
				}
			}
		}
	}
}
