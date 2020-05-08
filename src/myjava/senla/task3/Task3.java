package senla.task3;

import java.util.InputMismatchException;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		System.out.println("Enter the sentence: ");
		Scanner in = new Scanner(System.in);
		try {
			String sentence = in.nextLine();
			System.out.println("Count of words: "
					+ Program.getCountOfWords(sentence));
			System.out.println(Program.sorted(sentence));

		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
		}
	}

}
