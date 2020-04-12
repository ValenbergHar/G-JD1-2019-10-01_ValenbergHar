package patterns.patterns_templatemethod;

import java.util.Arrays;

public class DuckSortTestDrive {
	public static void main(String[] args) {
		Duck[] ducks = { new Duck("Daffy", 8), new Duck("Daffy", 2), new Duck("Daffy", 7), new Duck("Daffy", 2),
				new Duck("Daffy", 10), new Duck("Daffy", 2) };
		System.out.println("Before sorting:");
		display(ducks);
		Arrays.sort(ducks);
		System.out.println("\nAfter sorting:");
		display(ducks);
	}

	public static void display(Duck[] ducks) {
		for (Duck d : ducks) {
			System.out.println(d);
		}
	}
}