package foxford;

public class Numbers {

	public static void main(String[] args) {

		int N = 27;
		int sum = 0;
		int amount = 0;
		while (N > 0) {
			sum += N % 10;
			N = N / 10;
			amount++;
		}
		System.out.println(sum);
		System.out.println(amount);

		int C = 27;
		while (C > 0) {
			System.out.print(C % 2);
			C = C / 2;
		}

		System.out.println("");

		double D = 0.450000001;
		while (D > 0) {
			D = D * 2;
			int x = (int) D;
			System.out.print(x);
			D = D - x;
		}

	}

}
