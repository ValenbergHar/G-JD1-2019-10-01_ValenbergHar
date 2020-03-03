package javarush;

import java.util.Scanner;

public class Thread2 {

	public static void main(String[] args) {
		MyThread myTheard = new MyThread();
		myTheard.start();

		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		myTheard.shutdown();

	}

}

class MyThread extends Thread {
	private volatile boolean running = true;

	public void run() {
		while (running) {
			System.out.println("pachynaju");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

	public void shutdown() {
		this.running = false;
	}
}