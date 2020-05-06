package senla.task4;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		System.out.print("Number of digits: ");
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		int mas[] = new int[k];
		int numbers[] = new int[k];
		System.out.print("Enter numbers: ");
		for (int i = 0; i < k; i++) {
			mas[i] = in.nextInt();

		}
		System.out.print("Resulting array: ");
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
			findPolindrom(mas);

		}
	}

	private static void findPolindrom(int[] mas) {
		int d = 0;
		boolean b;

		for (int i = 0; i < mas.length; i++) {
			int m = 0;
			b = false;
			d = mas[i];
			int array[] = new int[numbers[i]];
			while (d > 0) {
				array[m] = d % 10;
				d = d / 10;
				m++;
			}
			d = array.length - 1;
			for (m = 0; m < d; m++) {
				if (array[m] == array[d]) {
					b = true;
				} else {
					b = false;
					break;
				}
				d--;
			}
			if (b) {
				System.out.println(mas[i] + " ");
				break;
			} else {
				System.out.println("There is no any palindrom ");
			}
		}
	}

}
