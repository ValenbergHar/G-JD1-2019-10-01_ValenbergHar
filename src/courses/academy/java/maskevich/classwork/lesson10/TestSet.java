package by.academy.java.maskevich.classwork.lesson10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestSet {
	private static int i;

	private static class Sample {
		private final int number;

		public Sample() {
			this.number = ++i;
		}

		@Override
		public int hashCode() {
			System.out.println("hashcode() called for s" + number);
			return super.hashCode();
//			return 1;
		}

		@Override
		public boolean equals(final Object obj) {
			System.out.println("equals() called for s" + number);
			return super.equals(obj);
//			return true;
		}
	}

	public static void main(String[] args) {
		final Set<Sample> set = new HashSet<>();
		final Sample s1 = new Sample();
		final Sample s2 = new Sample();
		final Sample s3 = new Sample();

		set.add(s1);
		set.add(s2);
		set.add(s3);
		
		System.out.println(set.size());

		set.contains(s1);
		set.contains(s2);
		set.remove(s3);

	}

}