package by.academy.java.maskevich.homework.task4.task41;

import java.util.ArrayList;
import java.util.List;

public class Region {
	

	public List<District> getListOfDistricts() {
		return districts;
	}

	public void setListOfDistricts(List<District> listOfDistricts) {
		this.districts = listOfDistricts;
	}

	private List<District> districts = new ArrayList<>();

	public void addRegions(District district) {
		districts.add(district);

	}
}
