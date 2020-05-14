package foxford;

public class SimpleNumbers {

	public static void main(String[] args) {
		int n = 100;
		int[] prime = new int[n + 1];
		for (int i = 0; i < prime.length; i++) {
			prime[i] = 1;
		}

//		for (int i = 0; i < prime.length; i++) {
//			System.out.printf("%4d", i);
//		}
//		System.out.println();
//
//		for (int i = 0; i < prime.length; i++) {
//			System.out.printf("%4d", prime[i]);
//		}
//		System.out.println();

		for (int i = 2; i < prime.length; i++) {
//			if (prime[i] == 0)
//				continue;
			for (int j = i + i; j < prime.length; j = j + i) {
				prime[j] = 0;
			}
		}
		for (int i = 0; i < prime.length; i++) {
			System.out.printf("%4d", i);
		}
		System.out.println();
		for (int i = 0; i < prime.length; i++) {
			System.out.printf("%4d", prime[i]);
		}
	}
}
