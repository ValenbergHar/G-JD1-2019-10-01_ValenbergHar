package javarush;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class SerReadObject {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("src\\myjava\\javarush\\people.bin");
			ObjectInputStream ois = new ObjectInputStream(fis);

			int personCount = ois.readInt();
			SerPerson[] peoplePersons = new SerPerson[personCount];

			for (int i = 0; i < personCount; i++) {
				peoplePersons[i] = (SerPerson) ois.readObject();
			}
			System.out.println(Arrays.toString(peoplePersons));

//			SerPerson person1 = (SerPerson) ois.readObject();
//			SerPerson person2 = (SerPerson) ois.readObject();

//			System.out.println(person1);
//			System.out.println(person2);

			ois.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
