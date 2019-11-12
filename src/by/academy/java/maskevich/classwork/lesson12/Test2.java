package by.academy.java.maskevich.classwork.lesson12;

public class Test2 {

	public static void main(String[] args)  {
		System.out.println("main:start");
		method1();
		System.out.println("main:end");
	}

	private static void method1()  {
		System.out.println("method1:start");
		try {
			method2();
			System.out.println("method1: after method2");
		} catch (Exception e) {
			System.out.println("method1: inside catch");
//			e.printStackTrace();
		}
		System.out.println("method1:end");
	}

	private static void method2() throws Exception {
		System.out.println("method2:start");
		if (true) {
//		    throw new RuntimeException(); UNCHECKED
//			throw new Exception();//CHECKED
		}
		System.out.println("method2:end");
	}
}