package javarush;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Thread8 {

	public static void main(String[] args) {

		ProdCons pc = new ProdCons();

		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					pc.produce();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					pc.consume();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
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
}

class ProdCons {
	private Queue<Integer> queue = new LinkedList<Integer>();
	private final int LIMIT = 10;
	private Object lock = new Object();

	public void produce() throws InterruptedException {
		while (true) {
			synchronized (lock) {
				while (queue.size() == LIMIT) {
					lock.wait();

				}
				int value = new Random().nextInt();
				
				queue.offer(value);
				System.out.println("Prod put " + value + ". Size in prod is "
						+ queue.size());
				lock.notify();
			}
			Thread.sleep(500);
		}
	}

	public void consume() throws InterruptedException {
		while (true) {
			synchronized (lock) {
				while (queue.size() == 0) {
					lock.wait();

				}
				int value = queue.poll();
				System.out.println(value);
				System.out.println("Con took " + value + ". Size in cons is "
						+ queue.size());
				lock.notify();
			}
			Thread.sleep(1000);
		}
	}
}
