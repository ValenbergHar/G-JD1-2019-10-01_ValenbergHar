
package by.academy.java.maskevich.classwork.lesson041;

public class Test2222 {
	// сумма четных чисел до ккакого-нибудь

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		while (i < 5) {
			if ((i % 2) == 0) {
				sum += 1;
			}
			i++;
		}
		System.out.println("sum = " + sum);

	}

}

