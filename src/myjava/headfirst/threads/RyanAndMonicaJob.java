package headfirst.threads;

public class RyanAndMonicaJob implements Runnable {
	private BankAccount account = new BankAccount();

	public static void main(String[] args) {
		RyanAndMonicaJob theJob = new RyanAndMonicaJob();
		Thread one = new Thread(theJob);
		Thread two = new Thread(theJob);
		one.setName("Rajzan");
		two.setName("Monika");
		one.start();
		two.start();
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			makeWithdraw(10);
			if (account.getBalance() < 0) {
				System.out.println("Zanadta");
			}
		}
	}

	private synchronized void makeWithdraw(int amount) {
		if (account.getBalance() >= amount) {
			System.out.println(Thread.currentThread().getName() + " is about to withdrawal");
			try {
				System.out.println(Thread.currentThread().getName() + " is going to sleep");
				Thread.sleep(500);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " woke up");
			account.withdraw(amount);
			System.out.println(Thread.currentThread().getName() + " completes the withdrawal");
		} else {
			System.out.println("Sorry, not enough for " + Thread.currentThread().getName());
		}
	}

}

class BankAccount {
	private int balance = 100;

	public int getBalance() {
		return balance;
	}

	public void withdraw(int amount) {
		balance = balance - amount;
	}
}