package senla.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringUtilits {
	static List<String> sorted(String sentence) {
		String result = sentence.substring(0, sentence.indexOf('.'));
		List<String> listString = new ArrayList<String>();
		for (String word : result.split(" ")) {
			listString.add(word.substring(0, 1).toUpperCase() + word.substring(1));
		}
		Collections.sort(listString);
		return listString;

	}

	static int getCountOfWords(String sentence) {
		String result = sentence.substring(0, sentence.indexOf('.'));
		int count = 0;
		if (result.length() != 0) {
			count++;
			for (int i = 0; i < result.length(); i++) {
				if (result.charAt(i) == ' ') {
					count++;
				}
			}
		}
		return count;
	}
}
