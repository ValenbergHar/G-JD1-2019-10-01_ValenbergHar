package senla.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
	public static Scanner intScanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter an integer: ");

		try {
			int n = intScanner.nextInt();
			printAnswer(n);

		} catch (InputMismatchException e) {
			System.out.println("Please, put an integer");
		}

	}

	private static void printAnswer(int i) {

		System.out.printf("%d is %s and %s.", i, IntegerUtilits.isPrime(i) ? "prime" : "composite",
				IntegerUtilits.isEven(i) ? "even" : "odd");
	}
}
