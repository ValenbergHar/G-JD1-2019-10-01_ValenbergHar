package by.academy.java.maskevich.homework.task4.task42;

import java.util.ArrayList;
import java.util.List;

public class Planet {
	private String name;
	private List<Ocean> oceanList = new ArrayList<>();
	private List<Continent> continentList = new ArrayList<>();
	private List<Island> islandList = new ArrayList<>();

	public Planet(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void addOcean(Ocean ocean) {
		oceanList.add(ocean);
	}

	public void addContinent(Continent continent) {
		continentList.add(continent);
	}

	public void addIsland(Island island) {
		islandList.add(island);
	}

	public List<Ocean> getOceanList() {
		return oceanList;
	}

	public List<Continent> getContinentList() {
		return continentList;
	}

	public List<Island> getIslandList() {
		return islandList;
	}

	public void printContinent(List<Continent> continentList) {
		for (Continent x : continentList) {
			System.out.println(x.getName() + "");
		}
	}
}