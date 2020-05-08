package senla.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
	static List<String> sorted(String sentence) {
		List<String> listString = new ArrayList<String>();
		for (String word : sentence.split(" ")) {
			listString.add(word.substring(0, 1).toUpperCase()
					+ word.substring(1));
		}
		Collections.sort(listString);
		return listString;

	}

	static int getCountOfWords(String sentence) {
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
