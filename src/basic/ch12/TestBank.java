package basic.ch12;

public class TestBank {
	public static void main(String[] args) {
		Bank bank1=new Bank("우리은행");
		Account a1=new Account("111-111");
		Account a2=new Account("222-222");
		Account a3=new Account("333-333");
		Account a4=new Account("444-444");
		
		a1.signInBank(bank1);
	}
}
