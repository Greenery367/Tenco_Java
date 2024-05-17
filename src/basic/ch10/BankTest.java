package basic.ch10;

public class BankTest {
	public static void main(String[] args) {
		// 함수의 시작
		// main 함수의 시작점인 public은 접근 제어 지시자이다.
		
		Bank bank1=new Bank();
		bank1.name="우리은행";
		//bank1.balance=100_000;
		
		bank1.deposit(10000);
		
		// 신입 개발자가 실수로 멤버 변수에 접근해서 수정...
		// Bank에 돈을 넣어야->deposit() 기능으로 만들어져 있다. 
		// bank1.balance=100_000; <- private 이후 정보은닉되었다.
		// 변수에 직접 접근하면, 의도하지 않은 실수를 발생시킬 수 있다. 
		
		// 현재 은행에 전체 잔고가 200,000 이하라고 하면
		// 본점에 금액 요청을 해야할 때가 있을 때
		System.out.println(bank1.getBalance());
		int money=bank1.getBalance();
		if(money<=200_000) {
			System.out.println("본점에 금액을 요청해");
		}
		
		bank1.setName("그린은행");
		System.out.println(bank1.getName());
		
		bank1.setBalance(-9999);
		System.out.println(bank1.getBalance());
		// getter, setter 를 통해 제어권을 가질 수 있다. (변수 제어 yes or no)
		// 정보 은닉의 개념으로, 객체의 상태값을 기능으로 제어하는 것이 객체 지향 패러다임이다.
		// 변수에 바로 접근->조작/settet-getter를 통해
	} // end of main

} // end of class
