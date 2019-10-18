package by.academy.java.maskevich.Classwork.lesson6;

public class Test3 {

	public static void main(String[] args) {
		String str = "Test     multiple      spaces";
		System.out.println(str.replaceAll(" +", " "));
	}
}
