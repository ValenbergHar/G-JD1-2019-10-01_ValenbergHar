package javarush;

import java.util.HashMap;

public class InnerClassBank {

	public class Account {
		private String id;
		private String name;
		private int money;

		public Account(String id, String name, int money) {
			this.id = id;
			this.name = name;
			this.money = money;

		}

		public void open() {
			accounts.put(id, this);
		}

		public void close() {
			accounts.remove(id);
		}

	}

	private InnerClassBank() {

	}

	HashMap<String, Account> accounts = new HashMap<String, Account>();

	public void putMoney(String id, int amount) {
		Account account = accounts.get(id);
		if (account == null) {
			return;
		}
		account.money += amount;

	}

	public void getMoney(String id, int amount) {
		Account account = accounts.get(id);
		if (account == null) {
			return;
		}
		account.money -= amount;
	}

	public static void main(String[] args) {
		InnerClassBank iCB = new InnerClassBank();
		InnerClassBank.Account account = iCB.new Account("ere", "Rerer Fefeg", 10000);
		account.open();
		account.close();
		
		
 
	}

}
