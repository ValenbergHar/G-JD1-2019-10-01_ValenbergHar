package javarush;

public class Thread3 {
	private int counter;

	// race condition - когда 2 потока пишут в одну переменную

	public static void main(String[] args) {
		Thread3 test = new Thread3();
		test.doWork();

	}

	private void increment() {
		synchronized (this) {
			counter++;
		}
	}

	public void doWork() {
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					increment();
				}
			}

		});
		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					increment();
				}
			}
		});
		thread1.start();
		thread2.start();
		System.out.println(counter);

		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(counter);
	}

}
