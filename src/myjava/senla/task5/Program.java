package senla.task5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	private static final int MIN_VALUE = 0;
	private static final int MAX_VALUE = 100;

	public static void main(String[] args) {
		Scanner integerScanner = new Scanner(System.in);
		System.out.println("Enter the length of the sequence from 0 to 100: ");
		try {
			int n = integerScanner.nextInt();
			if (!(n < MIN_VALUE || n > MAX_VALUE)) {
				for (int i = MIN_VALUE; i < n + 1; i++) {
					if (IntegerUtilits.isPalindrome(i))
						System.out.println(i);
				}
			} else
				System.out.println("The length of the sequence must be in the range from 0 to 100.");

		} catch (InputMismatchException e) {
			System.out.println("Invalid input.");
		}

	}

}
