package by.academy.java.maskevich.classwork.threads;

public class LambdaApp {

	public static void main(String[] args) {

		Operationable operation;
		operation = (x, y) -> x + y;

		int result = operation.calculate(10, 20);
		System.out.println(result); // 30
	}
}

interface Operationable {
	int calculate(int x, int y);
}