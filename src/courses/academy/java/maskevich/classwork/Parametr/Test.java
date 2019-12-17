package by.academy.java.maskevich.classwork.Parametr;

public class Test {

	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		box.setItem("Test");
		String item = box.getItem();

		Box<Integer> boxI = new Box<Integer>();
		boxI.setItem(4);
		Integer item1 = boxI.getItem();

	}

}
