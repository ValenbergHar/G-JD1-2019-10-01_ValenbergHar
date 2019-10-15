package by.academy.java.maskevich.Homework;

import java.util.Scanner;

public class Strr {

	public static void main(String[] args) {
		System.out.print("Введите количество переменных массива: ");
		Scanner in = new Scanner(System.in);
		int kolich = in.nextInt();

		int mas[] = new int[kolich];
		System.out.print("Введите числа: ");
		for (int i = 0; i < kolich; i++) {
			mas[i] = in.nextInt();
			int numbers[] = new int[kolich];
		}
		System.out.print("Полученный массив: ");
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
		System.out.print("\\n_____________");

		// вывести на консоль самое короткое и самое длинное число,
		// а также их длину. если чисел с одинаковой длиной
		// несколько - вывести первое по очереди

		int min = mas[0];
		int r1 = 0;

		
		int maxlength = 0;
		for (int i = 1; i < mas.length; i++) {
			min = mas[i];
			String str = Integer.toString(min);
//			int maxlength = str.length();
		//	System.out.println(min + " " + r11);
			
			
		}
		System.out.println(min + " " + maxlength);
	}

}
