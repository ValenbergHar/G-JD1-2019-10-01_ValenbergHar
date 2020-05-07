package senla.task5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		System.out.print("Number of digits: ");
		Scanner in = new Scanner(System.in);
		try {

			int k = in.nextInt();
			int arr[] = new int[k];
			System.out.print("Enter numbers: ");
			for (int i = 0; i < k; i++) {
				arr[i] = in.nextInt();
			}

			System.out.print("Resulting array: ");
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.print("\nPalindroms: ");

			for (int i = 0; i < arr.length; i++) {
				isPalindrome(arr[i]);
			}

		} catch (InputMismatchException e) {
			System.out.println("Invalid input.");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

	}

	static void isPalindrome(int k) {
		String s = String.valueOf(k);
		for (int i = 0, j = s.length() - 1; i < s.length() / 2; i++, j--) {
			if (s.charAt(i) == s.charAt(j)) {
				System.out.println(s + " ");
			}
		}

	}

}
