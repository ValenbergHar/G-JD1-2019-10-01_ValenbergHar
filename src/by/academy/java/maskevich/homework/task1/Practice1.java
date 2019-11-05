package by.academy.java.maskevich.homework.task1;

import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		System.out.print("Number of digits: ");
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		int mas[] = new int[k];
		int numbers[] = new int[k];
		System.out.print("Enter numbers: ");
		for (int i = 0; i < k; i++) {
			mas[i] = in.nextInt();
			numbers[i] = (mas[i] + "").length();
		}
		System.out.print("Resulting array: ");
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}

		makeLine();
		findnumbersLength(mas, numbers, k);
		makeLine();
		findnumbersAverage(mas, numbers, k);
		makeLine();
		findnumberEven(mas);
		makeLine();
		finddividethreefive(mas);
		makeLine();
		findprimeNumbers(mas);
		makeLine();
		findascenDingorder(mas, numbers, k);
		makeLine();
		findPolindrom(mas, numbers, k);

	}

	private static void makeLine() {
		System.out.println("\n__________________");
	}

	  private static void findnumbersLength(int[] mas, int[] numbers, int k) {
	        int bignum = numbers[0];
	        int smallnum = numbers[0];
	        int big = 0, small = 0;
	        int min = 10, max = 0;
	        int minStr = 0, maxStr = 0;
	        for (int i = 0; i < mas.length; i++) {
	            if ((mas[i] + "").length() < min) {
	                min = (mas[i] + "").length();
	                minStr = mas[i];
	            }
	            if ((mas[i] + "").length() > max) {
	                max = (mas[i] + "").length();
	                maxStr = mas[i];
	            }
	        }
	        System.out.printf("The longest number : %d, it's length: %d", maxStr, max);
	        System.out.printf("\n The shortest number: %d, it's length: %d", minStr, min);
	    }

	private static void findnumbersAverage(int[] mas, int[] numbers, int k) {
		float aver = 0;
		float d = k;
		int bigger = 0;
		int smaller = 0;
		int bignum = numbers[0];
		int smallnum = numbers[0];
		for (int i = 0; i < k; i++) {
			aver = aver + numbers[i];
		}
		aver = aver / d;
		System.out.println("\n Average number: " + aver);
		System.out.printf("\n Numbers with length less than average: ");
		for (int i = 0; i < k; i++) {
			if (aver > numbers[i]) {
				smaller = mas[i];
				smallnum = (mas[i] + "").length();
				System.out.printf("\n Number: %d, amount of digits: %d", smaller, smallnum);
			}
		}
		System.out.printf("\n Numbers with length more than average: ");
		for (int i = 0; i < k; i++) {
			if (aver < numbers[i]) {
				bigger = mas[i];
				bignum = (mas[i] + "").length();
				System.out.printf("\n Number: %d, amount of digits: %d", bigger, bignum);
			}
		}
	}

	private static void findnumberEven(int[] mas) {
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

	private static void finddividethreefive(int[] mas) {
		System.out.print("numbers divisible by 3 or 5: ");
		for (int i = 0; i < mas.length; i++) {
			if ((mas[i] % 3 == 0) || (mas[i] % 5 == 0)) {
				System.out.print(mas[i] + " ");
			}
		}
	}

	private static void findprimeNumbers(int[] mas) {
		boolean b = false;
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
			if (b) {
				System.out.print(mas[i] + " ");
			}
		}
	}

	private static void findascenDingorder(int[] mas, int[] numbers, int k) {
		int d = 0;
		boolean b;
		System.out.print("\n First number with ascending order digdts: ");
		for (int i = 0; i < k; i++) {
			int m = 0;
			b = false;
			d = mas[i];
			int array[] = new int[numbers[i]];
			while (d > 9) {
				array[m] = d % 10;
				d = d / 10;
				if (array[m] > d % 10) {
					b = true;
				} else {
					b = false;
					break;
				}
				m++;
			}
			if (b) {
				System.out.print(mas[i] + " ");
				break;
			}
		}
	}

	private static void findPolindrom(int[] mas, int[] numbers, int k) {
		int d = 0;
		boolean b;
		System.out.print("\n First palindrom: ");
		for (int i = 0; i < k; i++) {
			int m = 0;
			b = false;
			d = mas[i];
			int array[] = new int[numbers[i]];
			while (d > 9) {
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
