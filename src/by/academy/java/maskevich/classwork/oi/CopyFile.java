package by.academy.java.maskevich.classwork.oi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) throws IOException {

		try (FileInputStream in = new FileInputStream("input.txt");
				FileOutputStream out = new FileOutputStream("outut.txt")) {
			int c;
			while ((c = in.read()) != -1) {
				out.write(c);

			}

		}

	}
}
