package by.academy.java.maskevich.homework.task4.task41;

import java.util.ArrayList;

public class State {
	private String name;
	private ArrayList<District> districts;
	private City capital;

	public State(final String name, final ArrayList<District> districts) {
		this.name = name;
		this.districts = districts;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public ArrayList<District> getDistricts() {
		return districts;
	}

	public void setDistricts(final ArrayList<District> districts) {
		this.districts = districts;
	}
}