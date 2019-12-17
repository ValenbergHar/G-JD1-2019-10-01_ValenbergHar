
package by.academy.java.maskevich.classwork.lesson031.copy;

public class Test5 {
	private static class Car {
		private int year;

		public Car(int year) {
			this.year = year;
		}

		public int getYear() {
			return year;
		}
	}

	public static void main(String[] args) {
		Car car = new Car(2010);
		Car similarCar = new Car(2010);
		System.out.println(car == similarCar);

	}

}
