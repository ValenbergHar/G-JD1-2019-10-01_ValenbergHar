package by.academy.java.maskevich.classwork.lesson13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable {
	private String name;
	private int pause;

	public Task(String name, int pause) {
		super();
		this.name = name;
		this.pause = pause;
	}

	@Override
	public void run() {
		System.out.printf("executing task %s inside %s \n", name, Thread.currentThread().getName());
		try {
			Thread.sleep(pause);
			System.out.printf("task %s completed \n", name);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

public class FixedPoolExample {

	public static void main(String[] args) {
		ExecutorService poolExecutor = Executors.newFixedThreadPool(1);
		Task t1 = new Task("t1", 4000);
		Task t2 = new Task("t2", 9000);
		Task t3 = new Task("t3", 3000);

		poolExecutor.submit(t1);
		poolExecutor.submit(t2);
		poolExecutor.submit(t3);
		poolExecutor.shutdown();

	}

}