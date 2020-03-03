package by.academy.java.maskevich.classwork.oi;

import java.io.Serializable;

public class Brand implements Serializable {
	private String brand;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Brand(String brand) {
		super();
		this.brand = brand;
	}

}
