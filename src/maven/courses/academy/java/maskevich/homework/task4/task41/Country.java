package by.academy.java.maskevich.homework.task4.task41;

import java.util.ArrayList;
import java.util.List;

public class Country {

	private List<Region> regoins = new ArrayList<>();
	private List<Integer> area = new ArrayList<>();

	public List<Region> getRegoins() {
		return regoins;
	}

	public void setRegoins(List<Region> regoins) {
		this.regoins = regoins;
	}

	public List<Integer> getArea() {
		return area;
	}

	public void setArea(List<Integer> area) {
		this.area = area;
	}

	public void addArea(int i) {
		area.add(i);
	}

}