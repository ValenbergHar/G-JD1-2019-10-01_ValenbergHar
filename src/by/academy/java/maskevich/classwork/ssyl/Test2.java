package by.academy.java.maskevich.classwork.ssyl;

import java.util.Collection;
import java.util.function.Supplier;

class Car {
	public static Car create(final Supplier<Car> supplier) {
		return supplier.get();
	}
}

public class Test2 {

	public static void main(String[] args) {
		Supplier<Car> supplier = Car::new;
		final Car car = Car.create(supplier);
	}

}