package basic.ch23;

public class Mother extends Thread {
	
	BankAccount account;
	
	public Mother(BankAccount account) {
		this.account=account;
	}
	
	@Override
	public void run() {
		account.withDraw(5_000);
	}

}
