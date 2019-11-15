package by.academy.java.maskevich.classwork.oi;

import java.io.File;

public class FileSample {

	public static void main(String[] args) {
		showSamples(new File("C\\Windows\\winhlp32.exe"));
		System.out.println("_____________________");
		showSamples(new File("C\\Windows"));

	}

	private static void showSamples(final File f) {
		System.out.println("File name :" + f.getName());
		System.out.println("Path: " + f.getPath());
		System.out.println("Absolute path: " + f.getAbsolutePath());
		System.out.println("Parent: " + f.getParent());
		System.out.println("Exists: " + f.exists());
		if (f.exists()) {
			System.out.println("Is writeble: " + f.canWrite());
			System.out.println("Is readable: " + f.canWrite());
			System.out.println("Is directory: " + f.isDirectory());
			System.out.println("File Size in bytes " + f.length());
		}
	}

}