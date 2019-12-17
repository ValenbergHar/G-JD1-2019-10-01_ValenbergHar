package by.academy.java.maskevich.classwork.lesson11;

import java.util.Locale;
import java.text.NumberFormat;
import java.text.ParseException;

public class Test3 {

	public static class LcaleNumberParse {

		public static void main(String[] args) throws ParseException {
			Locale locale = new Locale("by", "BY");
			NumberFormat numFormat = NumberFormat.getNumberInstance(locale);
			Number num = numFormat.parse("10,5");
			System.out.println(num.doubleValue());

		}

	}
}