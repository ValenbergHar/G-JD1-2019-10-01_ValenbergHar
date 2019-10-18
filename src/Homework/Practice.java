package Homework;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		System.out.print("Number of digits: ");
		Scanner in = new Scanner(System.in);
		int kolich = in.nextInt();

		int mas[] = new int[kolich];
		int numbers[] = new int[kolich];

		System.out.print("Enter numbers: ");
		for (int i = 0; i < kolich; i++) {
			mas[i] = in.nextInt();
			numbers[i] = (mas[i] + "").length();
		}
		System.out.print("Resulting array: ");
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
		System.out.println("\n__________________");

		numbersLength(mas, numbers, kolich);
		System.out.println("\n__________________");
		numbersAverage(mas, numbers, kolich);
		System.out.println("\n__________________");
		numberEven(mas);
		System.out.println("\n__________________");
		dividethreefive(mas);
		System.out.println("\n__________________");
		primenumbers(mas);
		System.out.println("\n__________________");
		ascendingorder(mas, numbers, kolich);
		System.out.println("\n__________________");
		polindrom(mas, numbers, kolich);

	}

	
	private static void numbersLength(int[] mas, int[] numbers, int kolich) {
		int bignum = numbers[0];
		int smallnum = numbers[0];
		int big = 0, small = 0;

		for (int i = 0; i < mas.length; i++) {
			small = i;
			smallnum = (mas[i] + "").length();
		}

		for (int i = 0; i > mas.length; i++) {
			big = i;

			String str = Integer.toString(mas[i]);
			int maxlength = str.length();

			bignum = (mas[i] + "").length();
		}
		System.out.printf("The longest number : %d, it's length: %d", mas[big], bignum);
		System.out.printf("\n The shortest number: %d, it's length: %d", mas[small], smallnum);
	}

	private static void numbersAverage(int[] mas, int[] numbers, int kolich) {
		float aver = 0;
		float d = kolich;
		int bigger = 0;
		int smaller = 0;
		int bignum = numbers[0];
		int smallnum = numbers[0];

		for (int i = 0; i < kolich; i++) {
			aver = aver + numbers[i];
		}
		aver = aver / d;
		System.out.println("\n Average number: " + aver);
		System.out.printf("\n Numbers with length less than average: ");

		for (int i = 0; i < kolich; i++) {
			if (aver > numbers[i]) {
				smaller = mas[i];
				smallnum = (mas[i] + "").length();
				System.out.printf("\n Number: %d, amount of digits: %d", smaller, smallnum);
			}

		}
		System.out.printf("\n Numbers with length more than average: ");
		for (int i = 0; i < kolich; i++) {
			if (aver < numbers[i]) {
				bigger = mas[i];
				bignum = (mas[i] + "").length();
				System.out.printf("\n Number: %d, amount of digits: %d", bigger, bignum);
			}
		}
	}

	private static void numberEven(int[] mas) {
		int a = 0;
		int b = 0;
		int c = 0;
		for (int i = 0; i < mas.length; i++) {
			if ((mas[i] % 2 == 0) && (mas[i] >= 22)) {
				while (mas[i] != 0) {
					if (mas[i] % 2 == 0) {
						a = a + 1;
					}
					mas[i] = mas[i] / 10;
					b = b + 1;
				}
				if (a == b) {
					c = c + 1;

				}
			}
		}
		System.out.println("Amount of numbers containing only even numbers: " + c);
	}

	private static void dividethreefive(int[] mas) {
		System.out.print("numbers divisible by 3 or 5: ");
		for (int i = 0; i < mas.length; i++) {
			if ((mas[i] % 3 == 0) || (mas[i] % 5 == 0)) {
				System.out.print(mas[i] + " ");
			}
		}
	}

	private static void primenumbers(int[] mas) {
		boolean b;
		System.out.print("\n prime numbers :");
		for (int i = 0; i < mas.length; i++) {

			if ((mas[i] != 1) && (mas[i] != 2)) {
				for (int a = 2; a < mas[i]; a++) {
					if (mas[i] % a != 0) {
						b = true;
					} else {
						b = false;
						break;
					}
				}
			} else {
				b = true;
			}
			if (b = false) {
				System.out.print(mas[i] + " ");
			}

		}
	}

	private static void ascendingorder(int[] mas, int[] numbers, int kolich) {

		int d = 0;
		boolean b;
		System.out.print("\n First number with ascending order digdts: ");
		for (int i = 0; i < kolich; i++) {
			int k = 0;
			b = false;
			d = mas[i];
			int array[] = new int[numbers[i]];
			while (d > 9) {
				array[k] = d % 10;
				d = d / 10;
				if (array[k] > d % 10) {
					b = true;
				} else {
					b = false;
					break;
				}
				k++;
			}
			if (b == true) {
				System.out.print(mas[i] + " ");
				break;
			}
		}
	}

	private static void polindrom(int[] mas, int[] numbers, int kolich) {
		int d = 0;
		boolean b;
		System.out.print("\n First palindrom: ");
		for (int i = 0; i < kolich; i++) {
			int k = 0;
			b = false;
			d = mas[i];
			int array[] = new int[numbers[i]];
			while (d > 9) {
				array[k] = d % 10;
				d = d / 10;
				k++;
			}
			d = array.length - 1;
			for (k = 0; k < d; k++) {
				if (array[k] == array[d]) {
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
