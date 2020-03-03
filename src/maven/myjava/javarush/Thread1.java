package javarush;

public class Thread1 {

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println("Hello from Teard" + i);
				}
			}
		});
		t1.start();
		Thread.sleep(1000);

	}

}
