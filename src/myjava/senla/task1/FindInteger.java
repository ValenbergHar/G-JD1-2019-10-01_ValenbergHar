package senla.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FindInteger {
	public static  Scanner intScanner = new Scanner(System.in);
	

	public static void main(String[] args) {

		try {
			int n = intScanner.nextInt();
			
			Program.checkIsItInteger(n);
			Program.checkIsItANaturalNumber(n);
			Program.checkIsEvenOrOdd(n);

		} catch (InputMismatchException e) {
			System.out.println("Please, put an integer");
		}

	}






}
