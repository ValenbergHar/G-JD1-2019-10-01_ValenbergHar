package by.academy.java.maskevich.homework;

import java.util.Scanner;

public class Practice2 {
	public static void main(String[] args) {
		System.out.print("Enter n: ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		double[][] workArray = new double[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				workArray[i][j] = (int) ((Math.random() * (n * 100 - (-n * 100))) + (-n * 100)) / 100.00;
				System.out.print(workArray[i][j] + "  ");
			}
			System.out.println();
		}
		System.out.println("____________________");
		roundall(workArray, n);
		System.out.println("____________________");
		delete(workArray, n);
		System.out.println("____________________");
		compact(workArray);
		System.out.println("____________________");
		regularize(workArray, n);
		System.out.println("____________________");
		averagemin(workArray, n);
		System.out.println("____________________");
		sum(workArray, n);
		System.out.println("____________________");
		transp(workArray, n);
		System.out.println("____________________");

	}

	public static void roundall(double[][] workArray, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				workArray[i][j] = Math.round(workArray[i][j]);
				System.out.print(workArray[i][j] + "  ");
			}
			System.out.println();
		}
	}

	public static void delete(double[][] workArray, int n) {
		int[][] matrix_res = new int[n - 1][n - 1];
		int max = 0;
		int row = 0;
		int col = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (max < workArray[i][j]) {
					max = (int) workArray[i][j];
					row = i;
					col = j;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			if (i != row) {
				for (int j = 0; j < n; j++) {
					if (j != col) {
						System.out.print(workArray[i][j] + " ");
					}
				}
				System.out.println();
			}

		}
	}

	public static void compact(double[][] workArray) {
		int N = 5;
		int[][] a = { { 1, 0, 3, 4, 5 }, { 0, 0, 0, 0, 0 }, 
				{ 1, 0, 3, 5, 6 }, { 0, 0, 0, 5, 0 }, { 1, 0, 1, 1, 1 } };
		boolean p = false;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.printf("%d   ", a[i][j]);
			}
			System.out.println();
		}
		for (int i = 0; i < N; i++) {
			p = true;
			for (int j = 0; j < N; j++)
				if (a[i][j] != 0) {
					p = false;
					break;
				}
			if (p) {
				for (int k = i; k < (N - 1); k++)
					for (int j = 0; j < N; j++)
						a[k][j] = a[k + 1][j];
				--i;
				--N;
			}
		}
		for (int j = 0; j < N; j++) {
			p = true;
			for (int i = 0; i < N; i++)
				if (a[i][j] != 0) {
					p = false;
					break;
				}
			if (p) {
				for (int k = j; k < (N - 1); k++)
					for (int i = 0; i < N; i++)
						a[i][k] = a[i][k + 1];
				--j;
				--N;
			}
		}
		System.out.println("- - - - - - - - - -");

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.printf("%d   ", a[i][j]);
			}
			System.out.println();
		}
	}

	public static void regularize(double[][] workArray, int n) {
		int k = 1 + (int) (Math.random() * ((n - 1)));
		System.out.printf("column or row: %d", k);
		k--;

		for (int i = 0; i < n; i++) {
			for (int m = i + 1; m < n; m++) {
				if (workArray[i][k] > workArray[m][k]) {
					for (int j = 0; j < n; j++) {
						int temp = (int) workArray[i][j];
						workArray[i][j] = workArray[m][j];
						workArray[m][j] = temp;
					}
				}
			}
		}
		System.out.println("\n- - - - - - - - - -");
		System.out.printf("\n regularize array by column: \n");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(workArray[i][j] + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				for (int m = j + 1; m < n; m++) {
					if (workArray[k][j] > workArray[k][m]) {

						int temp = (int) workArray[i][j];
						workArray[i][j] = workArray[i][m];
						workArray[i][m] = temp;

					}
				}
			}
		}
		System.out.println("\n- - - - - - - - - -");
		System.out.printf("\n regularize array by row: \n");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(workArray[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void averagemin(double[][] workArray, int n) {

		for (int i = 0; i < n; i++) {
			int sum = 0;
			int aver = 0;
			for (int j = 0; j < n; j++) {
				sum = sum + (int) workArray[i][j];
				aver = sum / n;
				int k = (int) workArray[i][j] - aver;
				System.out.print(sum);
			}
			System.out.println();
		}
	}

	public static void sum(double[][] workArray, int n) {

		for (int i = 0; i < n; i++) {
			int indexStart = 0;
			for (int j = 0; j < n; j++) {
				if (workArray[i][j] > 0) {
					indexStart = j;

					break;

				}

			}
			System.out.println(indexStart + " ");
		}

		for (int i = 0; i < n; i++) {
			int indexEnd = 0;
			for (int j = n - 1; j < indexStart; j++) {
				if (workArray[i][j] > 0) {
					indexEnd = j;
					break;
				}
			}
			System.out.println(indexEnd);
		}
		for (int i = 0; i < n; i++) {
			int sum1 = 0;
			for (int j = indexStart + 1; j < indexEnd; j++)
				sum1 = sum1 + (int) workArray[i][j];
			System.out.println(sum1);

		}
	}

	public static void transp(double[][] workArray, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int temp = (int) workArray[i][j];
				workArray[i][j] = workArray[j][i];
				workArray[j][i] = temp;
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(workArray[i][j] + " ");
			}
			System.out.println();
		}

	}
}
