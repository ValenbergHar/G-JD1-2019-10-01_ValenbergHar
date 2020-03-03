package javarush;

import java.util.Arrays;

public class Regexp2 {

	public static void main(String[] args) {
		String a = "Hello45645there345hey";
		String[] word = a.split("\\d+");
		System.out.println(Arrays.toString(word));

		String b = "Hello56565there3434hey";
		String modString1 = b.replaceAll("\\d+", "υσι");
		String modString2 = b.replaceFirst("\\d+", "υσι");
		System.out.println(modString1);
		System.out.println(modString2);

	}

}
