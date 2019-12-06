package by.academy.java.maskevich.classwork.ssyl;

import java.util.function.Consumer;

public class Test {

	public static void main(String[] args) {
		Consumer<String> printFunction = System.out::print;
		printFunction.accept("Hello world");
	}

}