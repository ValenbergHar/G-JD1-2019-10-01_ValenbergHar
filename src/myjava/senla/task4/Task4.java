package senla.task4;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		System.out.print("Number of digits: ");
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		int mas[] = new int[k];
			System.out.print("Enter numbers: ");
		for (int i = 0; i < k; i++) {
			mas[i] = in.nextInt();
		}
		System.out.print("Resulting array: ");
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
			
			System.out.print("Palindroms: ");
			
			for (int i = 0; i < mas.length; i++) {
			isPalindrome(mas);
			}

		}
	}
	static boolean isPalindrome(int k) {
		String s = String.valueOf(k);
		for (int i = 0, j = s.length() - 1; i < s.length() / 2; i++, j--) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
		}

		return true;
	}
	
	}

}
