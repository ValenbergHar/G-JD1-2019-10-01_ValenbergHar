package by.academy.java.maskevich.homework.task4.task41;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class District {

	private int area;

	private List<City> cities = new ArrayList<>();

	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}

	public void addCity(City city) {
		cities.add(city);
	}

}