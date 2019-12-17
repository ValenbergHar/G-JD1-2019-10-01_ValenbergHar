package by.academy.java.maskevich.classwork.oi;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

public class SerCar implements Serializable {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("t.tmp");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		Car car = new Car("zaz", new Model("969"), new Brand("M"));
		oos.writeObject(car);
		oos.close();
	}

}
