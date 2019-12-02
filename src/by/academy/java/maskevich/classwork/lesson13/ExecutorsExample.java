package by.academy.java.maskevich.classwork.lesson13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsExample {

	public static void main(String[] args) {
		ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();

		Runnable task = new Runnable() {

			@Override
			public void run() {
				System.out.println("Execute task");

			}

		};
		singleThreadExecutor.submit(task);
		singleThreadExecutor.submit(task);

		singleThreadExecutor.shutdown();
//		singleThreadExecutor.submit(task);
//		
	}
}
