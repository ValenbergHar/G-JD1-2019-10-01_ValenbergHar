package senla.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
	public static Scanner in = new Scanner(System.in);
	static int var = 2;

	public static void main(String[] args) {

		try {
			int n = in.nextInt();
			checkIsItInteger(n);
			checkIsItANaturalNumber(n);
			checkIsEvenOrOdd(n);

		} catch (InputMismatchException e) {
			System.out.println("Please, put an integer");
		}

	}

	private static void checkIsItInteger(int n) {
		if (n % 1 == 0) {
			System.out.println(n + " is integer.");
		}
	}

	private static void checkIsItANaturalNumber(int n) {
		if (n > 1) {
			if (n % var != 0) {
				var++;
				checkIsItANaturalNumber(n);
			} else if (n % var == 0) {
				printIsItNaturalNumber(var, n);
			}
		}

	}

	private static void printIsItNaturalNumber(int var, int n) {
		if (var == n) {
			System.out.println(n + " is a natural number.");
		} else {
			System.out.println(n + " is not a natural number.");
		}
	}

	private static void checkIsEvenOrOdd(int n) {
		if (n % 2 == 0) {
			System.out.println(n + " is even number.");
		} else {
			System.out.println(n + " is odd number.");
		}
	}

}
