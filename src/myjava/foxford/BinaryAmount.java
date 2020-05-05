package foxford;

import java.util.Scanner;

public class BinaryAmount {
 public static	Scanner im = new Scanner(System.in);

	public static void main(String[] args) {

		int n= im.nextInt();
		String s = Integer.toBinaryString(n);
		int sum = 0;
		while(n>0){
			sum+=n%2;
			n=n/2;
		}
		System.out.println(sum);
		System.out.println(s);
	}

}
