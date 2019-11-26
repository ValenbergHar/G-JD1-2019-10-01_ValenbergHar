package by.academy.java.maskevich.homework.task6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;

public class Task1 {
	public static void main(String[] args) throws IOException {
		File f = new File("D:/New folder/java-wiki.txt");
		BufferedReader fin = new BufferedReader(new FileReader(f));
		String line;
		while ((line = fin.readLine()) != null) {
			line = correctInputText(line);
			if (!line.isEmpty()) {
				String[] words = line.split(" ");
				for (String word : words) {
					char c = word.toUpperCase().toCharArray()[0];
					if (Character.isLetter(word.toUpperCase().toCharArray()[0])) {
						File dir = new File("D:/New folder/" + c);
						if (!dir.exists()) {
							dir.mkdir();
							FileWriter writer = new FileWriter("D:/New folder/" + c + "/words.txt", true);
							writer.write(word);
							writer.flush();
							writer.close();
						}
					}
				}
			}
		}
	}

	public static String correctInputText(String line) {
		line = line.replace(".", "");
		line = line.replace(",", "");
		line = line.replace(";", "");
		line = line.replace(":", "");
		line = line.replace("!", "");
		line = line.replace("?", "");
		line = line.replace(".", "");
		line = line.replace("\"", "");
		line = line.replace("(", "");
		line = line.replace("\n", "");
		return line;
	}
}