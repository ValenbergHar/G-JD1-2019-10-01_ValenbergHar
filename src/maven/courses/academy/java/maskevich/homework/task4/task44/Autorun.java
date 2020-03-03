package by.academy.java.maskevich.homework.task4.task44;

import java.util.ArrayList;
import java.util.List;

public class Autorun {
	public static void main(String[] args) {
		Auto auto = new Auto();
		auto.setBrand("zaz");
		auto.setEngine(new Engine(10, EngineType.diesel));
		auto.setWheels(new ArrayList<>());
		List<Wheel> wheels = new ArrayList<Wheel>();
		auto.setWheels(wheels);
		wheels.add(new Wheel(15, 195));
		wheels.add(new Wheel(15, 195));
		wheels.add(new Wheel(15, 195));
		wheels.add(new Wheel(15, 195));
		auto.move();
		auto.refuel(15);
		auto.replaceWheel(1);
		auto.stop();
	}
}