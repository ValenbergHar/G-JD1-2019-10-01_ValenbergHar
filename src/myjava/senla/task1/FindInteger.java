package senla.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FindInteger {
	public static  Scanner in = new Scanner(System.in);
	

	public static void main(String[] args) {

		try {
			int n = in.nextInt();
			
			Program.checkIsItInteger(n);
			Program.checkIsItANaturalNumber(n);
			Program.checkIsEvenOrOdd(n);

		} catch (InputMismatchException e) {
			System.out.println("Please, put an integer");
		}

	}






}
