package javarush;

import java.util.Scanner;

public class Thread7 {

	public static void main(String[] args) {
		WaitNotify waitNotify = new WaitNotify();

		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					waitNotify.produce();
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
					waitNotify.consume();
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

class WaitNotify {
	public void produce() throws InterruptedException {
		synchronized (this) {
			System.out.println("Produser started");
			wait();// 1- give intrinsic lock, 2-waiting notify
			System.out.println("Produser resumed");
		}
	}

	public void consume() throws InterruptedException {
		Thread.sleep(2000);
		Scanner scanner = new Scanner(System.in);
		synchronized (this) {
			System.out.println("Waiting for return key pressed");
			scanner.nextLine();
			notify();
			Thread.sleep(2000);
		}
	}
}
