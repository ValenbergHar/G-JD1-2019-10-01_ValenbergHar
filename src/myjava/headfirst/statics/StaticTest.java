package headfirst.statics;

public class StaticTest extends StaticSuper {
	static int rand;

	static {
		rand = (int) (Math.random() * 6);
		System.out.println("Static block " + rand);
	}

	public StaticTest() {
		System.out.println("Constructor");
	}

	public static void main(String[] args) {
		System.out.println("Inside main");
		StaticTest staticTest = new StaticTest();
	}

}
