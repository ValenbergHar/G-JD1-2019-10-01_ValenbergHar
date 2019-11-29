package by.academy.java.maskevich.classwork.lesson13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;


public class ExecutorServiceExamples {

	public static void main(String[] args) {
		ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
		ExecutorService fixedPooExecutor = Executors.newCachedThreadPool();
		ScheduledExecutorService scheduledExecutor = Executors.newSingleThreadScheduledExecutor();

	}

}
