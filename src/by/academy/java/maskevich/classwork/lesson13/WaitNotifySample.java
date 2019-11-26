package by.academy.java.maskevich.classwork.lesson13;

public class WaitNotifySample {

	public static void main(String[] args) throws InterruptedException {
		Payment payment = new Payment();
		new Thread() {
			public void run() {
				payment.doPayment();
			};
		}.start();
		Thread.sleep(2000);
		synchronized (payment) {
			System.out.println("set payment and notify");
			Thread.sleep(2000);
			payment.setAmount(100);
			payment.notify();

		}
	}

}

class Payment {
	private int amount;

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public synchronized void doPayment() {
		System.out.println("Start payment. Waiting for amount");
		while (amount <= 0) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		System.out.println("payment completed");
	}

}