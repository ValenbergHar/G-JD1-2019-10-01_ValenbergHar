package by.academy.java.maskevich.classwork.oi;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;

public class DesCar {

	public static void main(String[] args) 	throws IOException, ClassNotFoundException {
			FileInputStream fis = new FileInputStream("t.tmp");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			System.out.println(ois.readObject());
			ois.close();
		}



	}


