package by.academy.java.maskevich.homework.task4.task41;

public class City {
	private String name;
	private CityType cityType;

	public City(String name, CityType cityType) {
		super();
		this.name = name;
		this.cityType = cityType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CityType getCityType() {
		return cityType;
	}

}