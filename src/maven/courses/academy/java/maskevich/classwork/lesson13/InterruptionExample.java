package by.academy.java.maskevich.classwork.lesson13;

class Incremenator extends Thread {
	private volatile boolean isIncrement = true;
	private volatile boolean toBeFinished = false;
	public int mValue = 0;

	public void changeAction() {
		isIncrement = !isIncrement;
	}

	public void finish() {
		this.toBeFinished = true;
	}

	@Override
	public void run() {
		System.out.println("Value = ");
		do {
//			if (!toBeFinished) {
			if (!Thread.interrupted()) {
				if (isIncrement) {
					mValue++;
				} else {
					mValue--;
				}
				System.out.println(mValue + " ");
			} else {
				return;
			}
			try {
				Thread.sleep(1000);
			} catch (final InterruptedException e) {
				System.out.println("Interrupted!");
				return;
			}
		} while (true);
	}

}

public class InterruptionExample {

	public static void main(String[] args) {
		final Incremenator incrementatorThread = new Incremenator();
		incrementatorThread.start();

		for (int i = 1; i <= 3; i++) {
			try {
				Thread.sleep(i * 2 * 1000);
			} catch (final InterruptedException e) {

			}
			incrementatorThread.changeAction();
		}
//		incrementatorThread.finish(); 
		incrementatorThread.interrupt();
	}

}