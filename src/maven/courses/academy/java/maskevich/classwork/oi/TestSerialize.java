package by.academy.java.maskevich.classwork.oi;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class TestSerialize {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("t.tmp");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeInt(12345);
		oos.writeObject("Today");
		oos.writeObject(new Date());
		oos.close();
	}

}
