package javarush;

public class StackTrace {
	public static void main(String[] args) {
		System.out.println("Метод Main успешно запущен");
		m1();
		System.out.println("Метод Main заканчивает свою работу");
	}

	static void m1() {
		try {
			System.out.println("Первый метод передает привет!(m1)");
			m2();
		} catch (ArithmeticException err) {
			System.out.println(err.getMessage());
			System.out.println("Второй метод завершился некорректно");
		} finally {
			System.out.println("Первый метод заканчивает свою работу");
		}
	}

	static void m2() {
		System.out.println("Второй метод передает привет!(m2)");
		int x = 10;
		int y = 0;
		double z = x / y;
		System.out.println(z);
		System.out.println("Второй метод заканчивает свою работу");
	}
}