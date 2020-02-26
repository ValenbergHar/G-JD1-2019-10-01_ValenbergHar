package javarush;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Thread5 {

	public static void main(String[] args) throws InterruptedException {
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		for (int i = 0; i < 5; i++) {
			executorService.submit(new Work(i));
		}
		executorService.shutdown();
		System.out.println("usio pachalosia");

		executorService.awaitTermination(1, TimeUnit.DAYS);

	}

}

class Work implements Runnable {
	public int id;

	public Work(int id) {
		this.id = id;
	}

	public void run() {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Work " + id + " was complited");
	}
}