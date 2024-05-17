package basic.ch23;

public class BankAccount {

	private int money = 100_000;

	public int getMoney() {
		return this.money;
	}

	public void setMoney(int m) {
		this.money = m;
	}

	// 출금
	public synchronized int withDraw(int money) {

		int currentMoney = getMoney();
		// ... 출금
		
		synchronized (this) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			if (currentMoney >= money) {
				setMoney(currentMoney - money);
				System.out.println("출금 후 계좌 잔액 : " + getMoney());
				return money;
			} else {
				System.out.println("계좌 잔액이 부족합니다.");
				return 0;
			}
		}
		}
		
		

	// 입금
	public synchronized void saveMoney(int money) {

		int currentMoney = getMoney();

		// 시간이 걸림
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		setMoney(currentMoney + money);
		System.out.println("입금 후 계좌 잔액 : " + getMoney());
	}

}
