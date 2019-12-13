package by.academy.java.maskevich.homework.task4.task41;

import java.util.ArrayList;
import java.util.List;

public class Region {
	int area;
	private List<District> districts = new ArrayList<>();

	public int getArea() {
		return area;
	}

	public void setArea(int i) {
		this.area = i;
	}

	public List<District> getDistricts() {
		return districts;
	}

	public void setListDistricts(List<District> districts) {
		this.districts = districts;
	}

	public void addRegions(District district) {
		districts.add(district);

	}
}