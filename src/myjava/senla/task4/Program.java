package senla.task4;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program {

	public static void main(String[] args) {

		try {
			Scanner stringScanner = new Scanner(System.in);
			System.out.println("Enter the text: ");

			String text = stringScanner.nextLine();
			System.out.println("Enter the word: ");
			String word = stringScanner.nextLine();
			System.out.printf("The word \"%s\" occurs in the text %d times", word,
					StringsUtilits.getWordCount(text, word));
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
		}
	}

}
