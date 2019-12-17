package by.academy.java.maskevich.homework.task3;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class Practice3 {
	public static void main(String[] args) throws Exception {
		String text = readFromUrl("http://25.io/toau/audio/sample.txt");
		System.out.println(text);
		text = correctInputText(text);
		makeLine();
		makeReplaceSimbol(text);
		makeLine();
		findFrequentlyNum(text);
		makeLine();
		findFirstAndLastSimilarLettersInWord(text);
		makeLine();
		findShotestLongestWords(text);
		makeLine();
	}

	private static String readFromUrl(final String url) throws MalformedURLException, IOException, ProtocolException {
		final URL obj = new URL(url);
		final HttpURLConnection connection = (HttpURLConnection) obj.openConnection();
		connection.setRequestMethod("GET");
		String string = null;
		try (final BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));) {
			String inputLine;
			final StringBuffer response = new StringBuffer();
			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
				string = response.toString();
			}
		}
		return string;
	}

	private static void makeLine() {
		System.out.printf("\n_____________________\n");
	}

	public static String correctInputText(String text) {
		text = text.replace(".", "");
		text = text.replace(",", "");
		text = text.replace(";", "");
		text = text.replace(":", "");
		text = text.replace("!", "");
		text = text.replace("?", "");
		text = text.replace(".", "");
		text = text.replace("\"", "");
		return text;
	}

	private static String makeReplaceSimbol(String text) {
		System.out.printf("\nEnter index n: ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println("Enter simbol: ");
		Scanner reader = new Scanner(System.in);
		char c = reader.next().charAt(0);
		String[] array = text.split(" ");
		for (int i = 0; i < array.length; i++) {
			if (array[i].length() >= n) {
				array[i] = array[i].substring(0, n - 1) + c + array[i].substring(n);
			}
		}
		System.out.println(String.join(" ", array));
		return text;
	}

	private static void findFrequentlyNum(String text) {
		System.out.printf("\nEnter index n: ");
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		char[] arrayNum = new char[k];
		System.out.printf("\nEnter symbols: ");
		for (int i = 0; i < k; i++) {
			arrayNum[i] = in.next().charAt(0);
		}
		int max = text.length();
		for (int i = 0; i <= arrayNum.length; i++) {
			int n = 0;
			for (int l = 0; l <= max - 1; l++) {
				if (arrayNum[i] == text.charAt(l)) {
					n++;
				}
			}
			if (n >= 1) {
				System.out.printf("\nSymbol %c occurs %d time(s)", arrayNum[i], n);
			} else {
				System.out.printf("\nThere is no symbol %c in this text", arrayNum[i]);
			}
		}
	}

	private static StringBuilder findFirstAndLastSimilarLettersInWord(String text) {
		String[] array = text.split(" ");
		StringBuilder sb = new StringBuilder();
		for (String word : array) {
			if (word.charAt(0) == word.charAt(word.length() - 1)) {
				System.out.print(sb.append(word).append(" "));
			}
		}
		return sb;
	}

	private static void findShotestLongestWords(String text) {
		String[] words = text.split(" ");
		int length = words[0].length();
		for (String word : words) {
			if (word.length() >= length) {
				length = word.length();
			}
		}
		for (String word : words) {
			if (word.length() == length) {
				System.out.println(word);
			}
			makeLine();
		}
		int maxLength = words[0].length();
		for (String word : words) {
			if (word.length() <= length) {
				length = word.length();
			}
		}
		for (String word : words) {
			if (word.length() == maxLength) {
				System.out.println(word);
			}
		}
	}
}