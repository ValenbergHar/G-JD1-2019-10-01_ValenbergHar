package by.academy.java.maskevich.classwork.threads;

public class Consumer implements Runnable {
	private final SingleElementBufer buffer;

	public Consumer(SingleElementBufer buffer) {
		this.buffer = buffer;
	}


	@Override
	public void run() {
while (true) {
	int elem;
	try {
		elem = buffer.get();
				System.out.println(elem + "consumed");
			} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	}

}
