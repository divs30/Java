
public class BankingExample {

	public static void main(String[] args) {
		Account acc = new Account(5000);
		TransactionThread t1 = new TransactionThread(acc, TransactionType.CREDIT, "Rita", 2000);
		TransactionThread t2 = new TransactionThread(acc, TransactionType.CREDIT, "\tRahul", 2500);
		TransactionThread t3 = new TransactionThread(acc, TransactionType.DEBIT, "\t\tSmitha", 3000);
		
		t1.start();
		t2.start();
		t3.start();
		
		// Barrier
		
		try {
			t1.join();
			t2.join(5000);
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Final Balance : " + acc.getBalance());
	}

}
