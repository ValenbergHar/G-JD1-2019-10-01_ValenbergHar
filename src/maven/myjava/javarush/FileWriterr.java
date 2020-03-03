package javarush;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriterr {

	public static void main(String[] args) {
		String sep = File.separator;
		String path = "D:" + sep + "txt1.txt";
		File file = new File(path);
		try {
			// PrintWriter pw = new PrintWriter(file);
			FileWriter fWriter = new FileWriter(file, true);
			// pw.println("jbhllllllllllllllllllllln");
			fWriter.write("jbhllllllllllllllllllllln");
			// pw.close();
			fWriter.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
