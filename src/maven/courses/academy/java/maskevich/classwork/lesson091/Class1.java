package by.academy.java.maskevich.classwork.lesson091;

public class Class1 {
	public void test1() {
		System.out.printf("%s.test1()\n", getClass().getSimpleName());
	}
	@Autoexecutable
	public void test2() {
		System.out.printf("%s.test2()\n", getClass().getSimpleName());
	}

	public void test3() {
		System.out.printf("%s.test3()\n", getClass().getSimpleName());
	}
}
