package by.academy.java.maskevich.Classwork.lesson4;

public class Test45 {

	public static void main(String[] args) {
		int i = 17;
		while (i <= 28) {
			if ((i % 13) == 0) {
				break;
			}
			i++;
		}
		System.out.println("First number is: " + i);
	}

}
