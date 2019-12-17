package by.academy.java.maskevich.homework.task5;

import java.io.File;
import java.io.PrintStream;
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
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		if (files == null) {
			return;
		}
		for (File p : files) {
			if (!p.isDirectory()) {
				for (int i = 0; i < level + 1; i++) {
					sb1.append("");
				}
				System.out.printf("\n%s%s, length: %s bytes", sb1, p.getName(), p.length());
			}
			if (p.isDirectory()) {
				try {
					for (int i = 0; i < level + 1; i++) {
						sb2.append("-");
					}
					System.out.printf("\n%s[%s]", sb2, p.getName());// tabs
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