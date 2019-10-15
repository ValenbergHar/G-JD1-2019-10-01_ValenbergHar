package by.academy.java.maskevich.Classwork.lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hello {

	public static void main(String[] args) throws IOException {
//		 ѕриветствовать любого пользовател€ при вводе его имени через командную строку.
		System.out.println("input username: ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String userName = reader.readLine();

		System.out.println("Hello, " + userName);

		}
	}


