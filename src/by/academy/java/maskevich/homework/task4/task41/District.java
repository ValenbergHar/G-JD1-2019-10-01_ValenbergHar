package by.academy.java.maskevich.homework.task4.task41;

import java.util.ArrayList;
import java.util.List;

public class District {

	public District(List<City> listOfCities) {

		this.listOfCities = listOfCities;
	}

	List<City> listOfCities = new ArrayList<>();

	public void addCity(City city) {
		listOfCities.add(city);
	}

}