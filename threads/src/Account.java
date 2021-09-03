public class Account {
	private double balance;

	public Account(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		try {
			Thread.sleep((long) (Math.random() * 2000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return balance;
	}

	private void setBalance(double balance) {
		try {
			Thread.sleep((long) (Math.random() * 2000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.balance = balance;
	}

	public synchronized  void deposit(String name, double amt) {
		System.out.println(name + " trying to deposit !!!");
		System.out.println(name + " getting the balance ");
		double bal = getBalance();
		System.out.println(name + " got balance : " + bal);
		bal += amt;
		System.out.println(name + " sets balance " + bal);
		setBalance(bal);
	}

	public synchronized  void withdraw(String name, double amt) {
		System.out.println(name + " trying to withdraw !!!");
		System.out.println(name + " getting the balance ");
		double bal = getBalance();
		System.out.println(name + " got balance : " + bal);
		bal -= amt;
		System.out.println(name + " sets balance " + bal);
		setBalance(bal);
	}
}