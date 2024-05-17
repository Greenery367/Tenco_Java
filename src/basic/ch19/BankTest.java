package basic.ch19;

public class BankTest {
	public static void main(String[] args) {
		
		Bank bank0=new Bank("그린은행"); // 독립적인 생명 주기를 가진다.
		Bank bank=new Bank("우리은행"); 
		Customer customer=new Customer("홍길동");
		
		// 연관관계라고 한다.
		customer.useBankService(bank);
		System.out.println("----------------");
		
		//enum 타입 연습
		bank.provideService(ServiceType.ACOUNT_INFO,customer);
	}

}
