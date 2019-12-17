package by.academy.java.maskevich.classwork.lesson06;

import java.util.Calendar;
import java.util.Date;

public class Test5 {

	public static void main(String[] args) {
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		System.out.println(date);

		long time = date.getTime();
		System.out.println(time);

		System.out.println(calendar);

		Date date2 = new Date(-1000000000);
		System.out.println(date2);
		long time1 = date.getMonth();
		System.out.println(time1);
		

	}

}
