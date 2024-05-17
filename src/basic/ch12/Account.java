package basic.ch12;

public class Account {
	private static String name;
	private static Bank bankname;
	private int waitNumber;
	
	public Account(String name) {
		this.name=name;
	}
	
	public void signInBank(Bank bank) {
		int a=bank.getNumber();
		bank.setNumber(a++);
		this.bankname=bank;
		System.out.println(name+"님께서 "+bank.getName()+"에 가입하셨습니다.");
		System.out.println("현재 가입자 수는 "+bank.getNumber()+"명 입니다.");
	}
	
	public void startWait() {
		waitNumber++;
	}
}
