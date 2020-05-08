package senla.task3;

import java.util.InputMismatchException;

import java.util.Scanner;

public class CountOfWords {
	public static void main(String[] args) {
		System.out.println("Enter the sentence: ");
		Scanner stringScanner = new Scanner(System.in);
		
		try {
			String sentence = stringScanner.nextLine();
			System.out.println("Count of words: "
					+ Program.getCountOfWords(sentence));
			System.out.println(Program.sorted(sentence));

		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
		}
	}

}
