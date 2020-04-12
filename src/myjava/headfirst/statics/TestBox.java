package headfirst.statics;

public class TestBox {
	Integer integer = 5;
	int j = 8;

	public static void main(String[] args) {
		TestBox testBox = new TestBox();
		testBox.go();
	}

	public void go() {
		 j = integer;
		//integer = j;
		System.out.println(integer);
		System.out.println(j);
	}
}
