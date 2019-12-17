package by.academy.java.maskevich.classwork.oi;

public class Gtr {

	public static void main(String[] args) throws Exception {
		try {
			try {
				throw new Exception();

			} catch (RuntimeException e) {
				System.out.println("sdsd");
			}

		} catch (Exception e) {
			System.out.println("hjhjhj");
		}

	}
}
