package by.academy.java.maskevich.classwork.lesson13;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceExample {

	public static void main(String[] args) {
		ScheduledExecutorService scheduledExecutor = Executors.newScheduledThreadPool(10);
		Callable<String> callable = new Callable<String>() {
			@Override
			public String call() throws Exception {
				System.out.println("Executed after delay!");
				return "Called!";
			}
		};
		scheduledExecutor.schedule(callable, 2, TimeUnit.SECONDS);

		Runnable command = new Runnable() {

			@Override
			public void run() {
				System.out.println("Executed periodically!");

			}
		};
		scheduledExecutor.scheduleAtFixedRate(command, 4, 2, TimeUnit.SECONDS);

	}

}