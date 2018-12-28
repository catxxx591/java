class BankAccount {
	private int balance = 100;
	  
	public int getBalance() {
		return balance;
	}
	public void withdraw(int amount) {
		balance = balance - amount;
	}
}

public class JayAndJolin implements Runnable {

	private BankAccount account = new BankAccount();

	public static void main (String [] args) {
		JayAndJolin  theJob = new JayAndJolin();
		Thread one = new Thread(theJob);
		Thread two = new Thread(theJob);
		one.setName("Jay");
		two.setName("Jolin");
		one.start();
		two.start();
	}

	public void run() {
		for (int x = 0; x < 10; x++) {
			makeWithdrawal(10);
			if (account.getBalance() < 0) {
				System.out.println("領過頭了!");
			}
		}
	}

	private synchronized void makeWithdrawal(int amount) {
		if (account.getBalance() >= amount) {
			System.out.println(Thread.currentThread().getName() + " 去提款");
			try {
				System.out.println(Thread.currentThread().getName() + " 去睡覺");
				Thread.sleep(500);
			} 
			catch(InterruptedException ex) {ex.printStackTrace(); }
			System.out.println(Thread.currentThread().getName() + " 起床");
			account.withdraw(amount);
			System.out.println(Thread.currentThread().getName() + " 完成提款" + account.getBalance() );
		}
		else {
			System.out.println("抱歉，沒有足夠的錢給 " + Thread.currentThread().getName());
		}
	}
}

  
     
      