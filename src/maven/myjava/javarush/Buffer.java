package javarush;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Buffer {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("D:/txt1.txt"));
			PrintWriter pw = new PrintWriter(new FileWriter("D:/txt2.txt"));
			try {
			
			String i= br.readLine();
			pw.println(i);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
		 br.close();
		 pw.close();
			
		}

	}

}
