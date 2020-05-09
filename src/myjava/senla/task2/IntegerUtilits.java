package senla.task2;

public class IntegerUtilits {
	static int gcd(int a, int b) {
		if (a == 0 && b == 0)
			throw new IllegalArgumentException("Parameters a and b are equals to zero.");
		return b == 0 ? a : gcd(b, a % b);
	}

	static int lcm(int a, int b) throws IllegalArgumentException{
		if (a == 0 && b == 0)
			throw new IllegalArgumentException("Parameters a and b are equals to zero.");
		return a / gcd(a, b) * b;
	}
}
