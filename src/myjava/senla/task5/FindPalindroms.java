package senla.task5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FindPalindroms {

	public static void main(String[] args) {
		System.out.print("Number of digits: ");
		Scanner integerScanner = new Scanner(System.in);
		try {

			int k = integerScanner.nextInt();
			int arr[] = new int[k];
			System.out.print("Enter numbers: ");
			for (int i = 0; i < k; i++) {
				arr[i] = integerScanner.nextInt();
			}

			System.out.print("Resulting array: ");
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.print("\nPalindroms: ");

			for (int i = 0; i < arr.length; i++) {
				Program.isPalindrome(arr[i]);
			}

		} catch (InputMismatchException e) {
			System.out.println("Invalid input.");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

	}

}
