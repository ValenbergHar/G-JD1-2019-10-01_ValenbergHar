package by.academy.java.maskevich.homework.task2;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        System.out.print("Enter N: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.print("Enter k: ");
        int k = in.nextInt();
//        array with numbers k=n*n
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(i * n + j + 1 + " ");
            }
            System.out.println();
        }
        System.out.printf("\n______________\n");
//        array with random numbers 
        int[][] workArray = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                workArray[i][j] = (int) (1 + (Math.random() *k)) ;
                System.out.print(workArray[i][j] + "  ");
            }
            System.out.println();
        }
    }
}