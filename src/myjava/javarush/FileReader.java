package javarush;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class FileReader {

	public static void main(String[] args) throws FileNotFoundException {
		String sep = File.separator;
		String path = "D:" + sep + "txt1.txt";
		File file = new File(path);
		Scanner scanner = new Scanner(file);
		String line = scanner.nextLine();
		String[] st = line.split(" ");
		System.out.println(Arrays.toString(st));
		scanner.close();

	}

}
