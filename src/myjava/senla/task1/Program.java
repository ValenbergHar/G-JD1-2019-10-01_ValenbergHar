package senla.task1;

public class Program {
	public static void checkIsItInteger(int n) {
		if (n % 1 == 0) {
			System.out.println(n + " is integer.");
		}
	}

	public static void checkIsItANaturalNumber(int n) {
		int var = 2;
		if (n > 1) {
			if (n % var != 0) {
				var++;
				checkIsItANaturalNumber(n);
			} else if (n % var == 0) {
				printIsItNaturalNumber(var, n);
			}
		}

	}

	public static void printIsItNaturalNumber(int var, int n) {
		if (var == n) {
			System.out.println(n + " is a natural number.");
		} else {
			System.out.println(n + " is not a natural number.");
		}
	}

	public static void checkIsEvenOrOdd(int n) {
		if (n % 2 == 0) {
			System.out.println(n + " is even number.");
		} else {
			System.out.println(n + " is odd number.");
		}
	}
}
