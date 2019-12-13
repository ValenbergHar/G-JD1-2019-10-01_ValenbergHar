package by.academy.java.maskevich.classwork.threads;

public class _0_SingleProducerExample {

	public static void main(String[] args) {
		SingleElementBufer buffer = new SingleElementBufer();
		new Thread(new Producer1(1, 1000, buffer)).start();
		new Thread(new Consumer1(buffer)).start();
	}

}
