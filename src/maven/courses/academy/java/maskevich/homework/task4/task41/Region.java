package by.academy.java.maskevich.homework.task4.task41;

import java.util.ArrayList;
import java.util.List;

public class Region {
	private int area;

	private List<District> districts = new ArrayList<>();

	public List<District> getDistricts() {
		return districts;
	}

	public void setListDistricts(List<District> districts) {
		this.districts = districts;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public void addRegions(District district) {
		districts.add(district);

	}

}