
package by.academy.java.maskevich.classwork.lesson031.copy;

public class Primitive {

	public static void main(String[] args) {
		final int a=1;
		final int b=2;
		System.out.println("before:" + a+ " and " + b);
		badSwap(a,b);
		System.out.println("after:" + a + " and " + b);
		
	}
	public static void badSwap (int a, int b) {
//		эти переменные не связаны, потому что они примитивные
		final int temp = a;
		a=b;
		b=temp;
	}

}

