package by.academy.java.maskevich.classwork.lesson06;

import java.util.Calendar;
import java.util.Date;

public class TestDate {

	public static void main(String[] args) {
		Date date1 = new Date();
		System.out.printf("current time: %s \n", date1.getTime());

		Calendar calendar = Calendar.getInstance();
		System.out.printf("current date2:%s\n", calendar.getTime().getTime());

		calendar.setTime(date1);
		System.out.printf("current date2 after setting date:%s\n", calendar.getTime().getTime());

		calendar.add(Calendar.DAY_OF_YEAR, -3);
		calendar.add(Calendar.SECOND, -1);

		System.out.printf("current date2 after setting date:%s\n", calendar.getTime());
	}

}
