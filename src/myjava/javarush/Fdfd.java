package javarush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.sun.corba.se.spi.ior.MakeImmutable;

public class Fdfd {

	public static void main(String[] args) throws IOException {
		year();
//		days();
//		bufferreader();
//		makeline();
//		inputstreamreader();
//		makeline();
//		sscanner();
//		makeline();
	}

	private static void makeline() {
		System.out.println("_____________________");

	}

	private static void year() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String s = reader.readLine();
		int year = Integer.parseInt(s);
		if (year % 400 == 0 || year % 100 == 0) {
			int x = 365;
			System.out.println("количество дней в году: " + x);
		} else if (year % 400 != 0 || year % 100 != 0 || year % 4 == 0) {
			int x = 366;
			System.out.println("количество дней в году: " + x);
		}else {
			System.out.println("году: " );
		}
	}

	private static void days() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String s = reader.readLine();
		int a = Integer.parseInt(s);
		switch (a) {
		case 1:
			System.out.println("понедельник");
			break;
		case 2:
			System.out.println("вторник");
			break;
		case 3:
			System.out.println("среда");
			break;
		case 4:
			System.out.println("четверг");
			break;
		case 5:
			System.out.println("пятница");
			break;
		case 6:
			System.out.println("суббота");
			break;
		case 7:
			System.out.println("воскресенье");
			break;
		default:
			System.out.println("такого дня недели не существует");
		}

	}

	private static void bufferreader() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String s = reader.readLine();
		System.out.println("read a line from keyboard:");
		System.out.println(s);

	}

	public static void inputstreamreader() throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in);
		int x = reader.read();
		System.out.println(x);
		char y = (char) x;
		System.out.println(y);

	}

	private static void sscanner() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write a number:");
		int number = sc.nextInt();
		System.out.println("The number is " + number);
	}

}
