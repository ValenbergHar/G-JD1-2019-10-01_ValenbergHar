package senla.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

 class FindGCDAndLCM {
	public static void main(String[] args) {
		Scanner intScanner = new Scanner(System.in);
		System.out.println("Enter two integers: ");

		try {
			int a = intScanner.nextInt();
			int b = intScanner.nextInt();
			System.out.printf(
					"Greatest Common Divisor: %d;\nLeast Common Multiple: %d.",
					Program.gcd(a, b), Program.lcm(a, b));
		} catch (InputMismatchException e) {
			System.out.println("Invalid input.");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

}
