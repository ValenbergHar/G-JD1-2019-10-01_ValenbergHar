package by.academy.java.maskevich.classwork.lesson13;

public class StringBufferExampleInThread {
	static int counter = 0;
	static StringBuffer s = new StringBuffer();
//	static StringBuilder s = new StringBuilder();

	public static void main(String[] args) throws InterruptedException {
		new Thread() {

			@Override
			public void run() {
				synchronized (s) {
					while (counter < 3) {
						s.append("A");
						System.out.println("> " + counter + " " + s);
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						counter++;
					}
				}
			}
		}.start();
		Thread.sleep(100);
		while (counter < 6) {
			s.append("B");
			System.out.println("< " + counter + " " + s);
			counter++;

		}

	}
}