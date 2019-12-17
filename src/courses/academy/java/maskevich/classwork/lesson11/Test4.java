package by.academy.java.maskevich.classwork.lesson11;

import java.util.Locale;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.DateFormat;
import java.util.Date;

public class Test4 {

	public static void main(String[] args) throws ParseException {
		Locale locale = new Locale("ru", "RU");
		Date currentDate = new Date();
		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, locale);
		Date parseDate = df.parse("10.12.2010");
		System.out.println(parseDate);

	}

}