package javarush;

public class TikTok implements Runnable {

	boolean isCancel = false;

	public void cancel() {
		isCancel = true;
	}

	@Override
	public void run() {
		while (!isCancel) {
			try {
				Thread.sleep(500);
				System.out.println("hujak");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		TikTok clockTikTok = new TikTok();
		Thread thread = new Thread(clockTikTok);
		thread.start();
		Thread.sleep(5000);
		clockTikTok.cancel();

	}

}
