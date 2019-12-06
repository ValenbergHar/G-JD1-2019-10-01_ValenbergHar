package by.academy.java.maskevich.classwork.ssyl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Paral{
	public static void main(String[] args) {
		List<String> values = new ArrayList<>();
		for (int i = 0; i < 1_000_000; i++) {
			UUID uuid = UUID.randomUUID();
			values.add(uuid.toString());
		}
		sortSequential(values);
		sortParallel(values);
	}

	private static void sortSequential(List<String> values) {
		long t0 = System.nanoTime();
		values.stream().sorted().count();
		System.out.println(String.format("sort took: %d ns", System.nanoTime() - t0));
	}

	private static void sortParallel(List<String> values) {
		long t0 = System.nanoTime();
		values.parallelStream().sorted().count();
		System.out.println(String.format("parallel sort took: %d ns", System.nanoTime() - t0));
	}
}
