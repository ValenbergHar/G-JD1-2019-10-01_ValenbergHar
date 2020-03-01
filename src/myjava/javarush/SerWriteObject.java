package javarush;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Iterator;

public class SerWriteObject {

	public static void main(String[] args) {
//		SerPerson person1 = new SerPerson(1, "Pazniack");
//		SerPerson person2 = new SerPerson(2, "Shushkievich");
		SerPerson[] sPersons = { new SerPerson(1, "Pazniack"), new SerPerson(2, "Shushkievich"),
				new SerPerson(3, "Kalinouski") };
		try {
			FileOutputStream fos = new FileOutputStream("src\\myjava\\javarush\\people.bin");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeInt(sPersons.length);
			
			for (SerPerson serPerson : sPersons) {
				oos.writeObject(serPerson);
			}
//			oos.writeObject(person1);
//			oos.writeObject(person2);
			oos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
