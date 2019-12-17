package by.academy.java.maskevich.classwork.java8.defaultmeth;

public interface Rectangle {
	static int squareStatic(int a, int b) {
		return a * b;
	}

	default int squareDefault(int a, int b) {
		return a * b;
	}

}
