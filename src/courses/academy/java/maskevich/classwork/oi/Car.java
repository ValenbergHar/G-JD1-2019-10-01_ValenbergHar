package by.academy.java.maskevich.classwork.oi;

import java.io.Serializable;

public class Car implements Serializable {
	private static final long serialVersionUID = 2L;
	private String bin;
	private  Model model;
	private transient Brand brand;

	

	Car(String bin, Model model, Brand brand) {
		super();
		this.bin = bin;
		this.model = model;
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Car [bin=" + bin + ", model=" + model + ", brand=" + brand + "]";
	}

}
