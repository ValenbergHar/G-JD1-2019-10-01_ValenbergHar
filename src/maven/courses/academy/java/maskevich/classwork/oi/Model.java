package by.academy.java.maskevich.classwork.oi;

import java.io.Serializable;

public class Model implements Serializable {
	private String model;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Model(String model) {
		super();
		this.model = model;
	}
	
	

}
