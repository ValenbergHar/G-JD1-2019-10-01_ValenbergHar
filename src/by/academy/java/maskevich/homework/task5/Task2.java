package by.academy.java.maskevich.homework.task5;

import java.io.File;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		System.out.printf("\nEnter disc name" + ": ");
		Scanner in = new Scanner(System.in);
		String n = in.next();
		showFilesAndDirectoryes(new File(n + ":\\"), 0);
	}

	private static void showFilesAndDirectoryes(File file, int level) {

		File[] files = file.listFiles();

		if (files == null) {
			return;
		}
		for (File p : files) {
			if (!p.isDirectory()) {
				System.out.printf("\n--%s, length: %s bytes", p.getName(), p.length());
			}
			if (p.isDirectory()) {
				try {
					System.out.printf("\n       [%s]", p.getName());//tabs

					if (level >= 5) {
						continue;
					}
					showFilesAndDirectoryes(p, level++);
				} catch (Exception e) {

					e.printStackTrace();
				}

			}
		}
	}
}