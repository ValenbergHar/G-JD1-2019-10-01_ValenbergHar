package by.academy.java.maskevich.classwork.lesson13;

class JoinThread extends Thread {

	public JoinThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		String threadName = getName();
		long timeout = 0;
		System.out.println("Thread start " + threadName);
		try {
			switch (threadName) {
			case "1":
				timeout = 5000;
				break;
			case "2":
				timeout = 1000;
				break;
			}
			Thread.sleep(timeout);
			System.out.println("Thread end " + threadName);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

public class JoinRunner {

	public static void main(String[] args) {
		System.out.println("Start main thread");
		Thread t1 = new JoinThread("1");
		Thread t2 = new JoinThread("2");
		t1.start();
		t2.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("End main thread");

	}

}