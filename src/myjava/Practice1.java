ublic class Practice1 {
	public static void main(String[] args) {
		System.out.print("Number of digits: ");
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		int mas[] = new int[k];
		int numbers[] = new int[k];
		System.out.print("Enter numbers: ");
		for (int i = 0; i < k; i++) {
			mas[i] = in.nextInt();
			numbers[i] = (mas[i] + "").length();
		}
		System.out.print("Resulting array: ");
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}

		makeLine();
		findnumbersLength(mas, numbers, k);
		makeLine();
		findnumbersAverage(mas, numbers, k);
		makeLine();
		findnumberEven(mas);
		makeLine();
		finddividethreefive(mas);
		makeLine();
		findprimeNumbers(mas);
		makeLine();
		findascenDingorder(mas, numbers, k);
		makeLine();
		findPolindrom(mas, numbers, k);

