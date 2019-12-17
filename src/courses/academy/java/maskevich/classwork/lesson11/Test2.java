package by.academy.java.maskevich.classwork.lesson11;

import java.util.Locale;
import java.text.NumberFormat;

public class Test2 {

	public static void main(String[] args) {
		Locale locale = new Locale("ua", "UA");
		NumberFormat rubFormat = NumberFormat.getCurrencyInstance(locale);
		System.out.println(rubFormat.format(1000));
	}
}
