package by.academy.java.maskevich.homework.task4.task42;

import java.util.List;

public class PlanetRunner {
	public static void main(String[] args) {
		Island island = new Island("Pascua");
		Planet planet = new Planet("Earth");
		Ocean ocean = new Ocean("Atlantic");
		planet.addOcean(ocean);
		Continent continent1 = new Continent("Eurasia");
		planet.addContinent(continent1);
		Continent continent2 = new Continent("North America");
		planet.addContinent(continent2);

		System.out.println("Planet name: " + planet.getName());
		System.out.println("Continent name: " + (continent1.getName()));
		System.out.println("Count continents:" + planet.getContinentList().size());
		planet.printContinent(planet.getContinentList());
	}
}
