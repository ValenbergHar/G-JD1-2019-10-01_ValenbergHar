package headfirst.threads;

public class MyRunnable implements Runnable {
	public void run() {
		go();
	}

	public void go() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		doMore();
	}

	public void doMore() {
		System.out.println(" op î'the stack");
	}
}
