package javarush;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solutiion {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(reader.readLine());
		if (a > 0) {
			System.out.println((2 * a));
		} else {
			if (a == 0) {
				System.out.println("0");
			} else {
				if (a == 0) {
					System.out.println((a + 1));
				}
			}

		}
	}

}