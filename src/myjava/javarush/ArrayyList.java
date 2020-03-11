package javarush;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayyList {
	public static void main(String[] args) {
		List<Integer> linkedklist = new LinkedList<>();
		List<Integer> arraylist = new ArrayList<>();

		measureTime(linkedklist);
		measureTime(arraylist);

	}

	private static void measureTime(List<Integer> list) {
		long starttime = System.currentTimeMillis();

		for (int i = 0; i < 1000000; i++) {
			list.add(i);
		}

		long endtime = System.currentTimeMillis();

		System.out.println(endtime - starttime);
	}
}
