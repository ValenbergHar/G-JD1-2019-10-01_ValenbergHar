package senla.task4;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tas4 {

	public static void main(String[] args) {

		try {
			Scanner in = new Scanner(System.in);
			System.out.println("Enter the text: ");

			String text = in.nextLine();
			System.out.println("Enter the word: ");
			String word = in.nextLine();
			System.out.printf("The word \"%s\" occurs in the text %d times",
					word, Program.getWordCount(text, word));
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
		}
	}

}
