package senla.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two integers: ");

		try {
			int a = in.nextInt();
			int b = in.nextInt();
			System.out.printf(
					"Greatest Common Divisor: %d;\nLeast Common Multiple: %d.",
					gcd(a, b), lcm(a, b));
		} catch (InputMismatchException e) {
			System.out.println("Invalid input.");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

	static int gcd(int a, int b) {
		if (a == 0 && b == 0)
			throw new IllegalArgumentException(
					"Parameters a and b are equals to zero.");
		return b == 0 ? a : gcd(b, a % b);
	}

	static int lcm(int a, int b) {
		if (a == 0 && b == 0)
			throw new IllegalArgumentException(
					"Parameters a and b are equals to zero.");
		return a / gcd(a, b) * b;
	}

}
