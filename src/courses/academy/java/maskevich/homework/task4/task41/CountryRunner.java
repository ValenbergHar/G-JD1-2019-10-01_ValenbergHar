package by.academy.java.maskevich.homework.task4.task41;

import java.util.ArrayList;
import java.util.List;

public class CountryRunner {
	public static void main(String[] args) {
		City city1 = new City("Miensk", CityType.CAPITAL_AND_DISTRICT_CENTRE);
		City city2 = new City("Hrodna", CityType.DISTRICT_CENTRE);
		City city3 = new City("Homel", CityType.DISTRICT_CENTRE);
		City city4 = new City("Lida", CityType.DEFAULT);
		City city5 = new City("Dziatlava", CityType.DEFAULT);

		District district1 = new District();
		District district2 = new District();
		District district3 = new District();
		District district4 = new District();
		District district5 = new District();

		district1.getCities().add(city1);
		district2.getCities().add(city2);
		district3.getCities().add(city3);
		district4.getCities().add(city4);
		district5.getCities().add(city5);

		Region region1 = new Region();
		Region region2 = new Region();
		Region region3 = new Region();

		region1.getDistricts().add(district1);
		region2.getDistricts().add(district2);
		region2.getDistricts().add(district4);
		region2.getDistricts().add(district5);
		region3.getDistricts().add(district3);

		Region area1 = new Region();
		Region area2 = new Region();
		Region area3 = new Region();

		Country country = new Country();

		country.getRegoins().add(region1);
		country.getRegoins().add(region2);
		country.getRegoins().add(region3);

		country.addArea(154000);
		country.addArea(54309);
		country.addArea(34556);

		getDistrictsAmount(country);
		getCapital(country);
		getDistrictsCentres(country);
		getArea(country);

	}

	private static void getDistrictsAmount(Country country) {
		System.out.println("Regions amount - " + country.getRegoins().size());
	}

	private static void getCapital(Country country) {
		country.getRegoins()
				.forEach(region -> region.getDistricts().forEach(district -> district.getCities().forEach(city -> {
					if (city.getCityType().equals(CityType.CAPITAL_AND_DISTRICT_CENTRE)) {
						System.out.println("Capital " + city.getName());
					}
				})));
	}

	private static void getDistrictsCentres(Country country) {
		country.getRegoins()
				.forEach(region -> region.getDistricts().forEach(district -> district.getCities().forEach(city -> {
					if ((city.getCityType().equals(CityType.DISTRICT_CENTRE))
							|| (city.getCityType().equals(CityType.CAPITAL_AND_DISTRICT_CENTRE))) {
						System.out.println("District centre " + city.getName());
					}
				})));
	}

	private static void getArea(Country country) {
		int i = 0;
		country.getArea().forEach(area -> i = i + area);
		System.out.println(i);
	}

}