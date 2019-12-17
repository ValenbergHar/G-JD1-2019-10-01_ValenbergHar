package by.academy.java.maskevich.classwork.threads;

public class Producer implements Runnable {
	private int startValue;
	private final int period;
	private final SingleElementBufer buffer;

	public Producer(int startValue, int period, SingleElementBufer buffer) {
		super();
		this.startValue = startValue;
		this.period = period;
		this.buffer = buffer;
	}

	@Override
	public void run() {
		while (true) {
			System.out.println(startValue + "Producer");
			try {
				buffer.put(startValue ++);
				Thread.sleep(period);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
