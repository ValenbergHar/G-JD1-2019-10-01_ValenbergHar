package headfirst;

import java.util.Calendar;

public class Calendaras {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(2020, 5, 7, 15, 40);
		long day1 = calendar.getTimeInMillis();
		day1 += 1000 * 60 * 60;
		calendar.setTimeInMillis(day1);
		System.out.println("New time: " + calendar.get(calendar.DAY_OF_YEAR));
		calendar.add(calendar.DATE, 45);
		System.err.println(calendar.getTime());

	}

}
