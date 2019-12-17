package by.academy.java.maskevich.classwork.lesson07;

public class Sample {

	private static abstract class Shape {
		abstract void draw();
	}

	private static class Circle extends Shape {
		void draw() {
			System.out.print("0");
		}
	}

	private static class Triangle extends Shape {
		void draw() {
			System.out.print("/_\\");
		}
	}

	public static void main(String[] args) {
		drawShape5Times(new Circle());
		System.out.println();
		drawShape5Times(new Triangle());

	}
	
	private static void drawShape5Times(Shape shape) {
	for (int i = 0; i < 5; i++) {
		shape.draw();
	}
}

//	private static void drawTriangles5Times(Triangle triangle) {
//		for (int i = 0; i < 5; i++) {
//			triangle.draw();
//		}
//	}
//
//	private static void drawCircleles5Times(Circle circle) {
//		for (int i = 0; i < 5; i++) {
//			circle.draw();
//		}
//	}
}
