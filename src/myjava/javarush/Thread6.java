package javarush;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Thread6 {

	private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

	public static void main(String[] args) {
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					produce();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					consumer();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		thread1.start();
		thread2.start();

		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void produce() throws InterruptedException {
		Random random = new Random();
		while (true) {
			Thread.sleep(500);
			int a = random.nextInt(100);
			System.out.println("Put " + a);
			queue.put(a);

		}
	}

	public static void consumer() throws InterruptedException {
		while (true) {
			Thread.sleep(1000);
			System.out.println("Take " + queue.take());
			System.out.println("Size is " + queue.size());
		}
	}

}
