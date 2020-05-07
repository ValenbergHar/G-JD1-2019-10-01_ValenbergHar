package senla.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		System.out.println("Enter the sentence: ");
		Scanner in = new Scanner(System.in);
		try {
			String sentence = in.nextLine();
			System.out.println("Count of words: " + getCountOfWords(sentence));
			System.out.println(sorted(sentence));

		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
		}
	}

	private static List<String> sorted(String sentence) {
		List<String> listString = new ArrayList<String>();
		for (String word : sentence.split(" ")) {
			listString.add(word.substring(0, 1).toUpperCase()
					+ word.substring(1));
		}
		Collections.sort(listString);
		return listString;

	}

	private static int getCountOfWords(String sentence) {
		int count = 0;
		if (sentence.length() != 0) {
			count++;
			for (int i = 0; i < sentence.length(); i++) {
				if (sentence.charAt(i) == ' ') {

					count++;
				}
			}
		}

		return count;

	}

}
