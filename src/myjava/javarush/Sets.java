package javarush;

import java.util.HashSet;
import java.util.Set;

public class Sets {

	public static void main(String[] args) {

		Set<Integer> set1 = new HashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);

		Set<Integer> set2 = new HashSet<>();
		set1.add(3);
		set1.add(4);
		set1.add(5);
		set1.add(6);
		set1.add(7);


		// intersection
		Set<Integer> intersection = new HashSet<>(set2);
		intersection.retainAll(set1);
		System.out.println(intersection);

		// difference
		Set<Integer> difference = new HashSet<>(set1);
		difference.removeAll(set2);
		System.out.println(difference);

		// union
		Set<Integer> union = new HashSet<>(set1);
		union.addAll(set2);
		System.out.println(union);
	}
}
