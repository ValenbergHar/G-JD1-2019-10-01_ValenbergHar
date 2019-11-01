package by.academy.java.maskevich.classwork.lesson06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test4 {

	public static void main(String[] args) {
		Pattern p = Pattern.compile(" +- +");
		Matcher matcher = p.matcher("Test - string - test");
		while (matcher.find()) {
		System.out.println(matcher.start() + " " + matcher.end());
		}
	}
}



