package by.academy.java.maskevich.homework.task4.task44;

import java.util.List;

public class Auto {
	private String brand;
	private Engine engine;
	private List<Wheel> wheels;
	private String vin;

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public List<Wheel> getWheels() {
		return wheels;
	}

	public void setWheels(List<Wheel> wheels) {
		this.wheels = wheels;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void move() {
		System.out.println("Auto starts");
	}

	public void stop() {
		System.out.println("Auto stops");
	}

	public void refuel(double liter) {
		System.out.printf("Auto filled up by %s liter(s)\n", liter);
	}

	public void replaceWheel(int num) {
		if (num >= 1 && num <= 4) {
			System.out.println("Wheel number " + num + " replaced");
		}
	}
}