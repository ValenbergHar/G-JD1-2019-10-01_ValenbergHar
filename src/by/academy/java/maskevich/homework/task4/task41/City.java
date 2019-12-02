package by.academy.java.maskevich.homework.task4.task41;

public class City {
	private String name;
	private boolean isCapital;
	private boolean isRegoinCenter;



	public City(String name, boolean isCapital, boolean isRegoinCenter) {
		super();
		this.name = name;
		this.isCapital = isCapital;
		this.isRegoinCenter = isRegoinCenter;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isCapital() {
		return isCapital;
	}

	public void setCapital(boolean isCapital) {
		this.isCapital = isCapital;
	}

}