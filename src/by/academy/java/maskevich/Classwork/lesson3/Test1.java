package by.academy.java.maskevich.Classwork.lesson3;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
	public static void main(String[] args) {
		List list = new ArrayList();
		System.out.println("free man " + Runtime.getRuntime().freeMemory());

		for (int i = 0; i < 15_000_000; i++) {
			list.add(new Man(i));
		}
		System.out.println("free man " + Runtime.getRuntime().freeMemory());
	}
}
