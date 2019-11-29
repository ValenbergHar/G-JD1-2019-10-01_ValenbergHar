package by.academy.java.maskevich.homework.task6;

import java.io.File;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		System.out.printf("\nEnter disc name" + ": ");
		Scanner in = new Scanner(System.in);
		String n = in.next();
		showFilesAndDirectoryes(new File(n + ":\\"));
	}

	private static void showFilesAndDirectoryes(File file) {

		File[] files = file.listFiles();
		for (File p : files) {
			if (!p.isDirectory()) {
				System.out.printf("\n--Name of file: %s, length: %s bytes", p.getName(), p.length());
			}
			if (p.isDirectory()) {
				try {
					System.out.printf("\n-Name of directory: %s", p.getName());
					showFilesAndDirectoryes(p);
				} catch (Exception e) {

					e.printStackTrace();
				}

			}
		}
	}
}