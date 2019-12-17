package by.academy.java.maskevich.classwork.lesson01.copy2;

public class ObjectExampe {
	public static class Car {
		int year;
		}

		public static void main(final String[] args) {
		final Car c1 = new Car();
		c1.year = 2010;
		final Car c2 = c1;

		System.out.println("c1.year=" + c1.year);
		System.out.println("c2.year=" + c2.year);

		System.out.println("change c1...");
		c1.year = 2018;
		System.out.println("c1.year=" + c1.year);
		System.out.println("c2.year=" + c2.year);
	}}


