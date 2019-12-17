package by.academy.java.maskevich.classwork.lesson06;

public class Test2 {

	public static void main(String[] args) {
//		System.out.println("20932".matches("-?[0-9]+"));
		String str = "Text    string for split";
		String[] words = str.split(" ");
		for (String word: words) {
			System.out.print(word + " ");
		}

	}

}
