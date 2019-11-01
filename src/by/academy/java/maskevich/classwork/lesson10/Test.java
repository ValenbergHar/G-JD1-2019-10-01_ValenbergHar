package by.academy.java.maskevich.classwork.lesson10;

import java.util.ArrayList;
import java.util.List;

public class Test {
	private static int i;

	private static class Sample {
		private final int number;

		public Sample() {
			this.number = ++i;
		}

		
		public int hashcode() {
			System.out.println("hashCode");
			return number;
			
		}
		
		public boolean equals(final Object obj) {
			System.out.println("equals() called for s" + number);
			return super.equals(obj);
//			return true;
			
		}

	}

	public static void main(String[] args) {
		final List<Sample> list = new ArrayList<>();

		final Sample s1 = new Sample();
		final Sample s2 = new Sample();
		final Sample s3 = new Sample();
		list.add(s1);
		list.add(s2);
		list.add(s3);

		list.contains(s1);
		list.indexOf(s2);
		list.remove(s3);
	}

}