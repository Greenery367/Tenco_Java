package basic.ch19;

public class Bank {

	private String name;

	public Bank(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	// 대표적인 Bank의 대표적인 기능
	public void provideService(ServiceType serviceType, Customer customer) {
		switch (serviceType) {
		case ACOUNT_INFO:
			System.out.println(customer.getName() + "계좌 정보 조회를 시작합니다.");
			break;
		case DEPOSIT:
			System.out.println(customer.getName() + "입금을 진행합니다.");
			break;
		case WITHDRAW:
			System.out.println(customer.getName() + "출금을 진행합니다.");
		default:
			System.out.println();
		}
	}

	// 상호 작용 할 수 있도록 코드 설계
	public void showAccountInfo(Customer c1) {
		System.out.println("사용자 이름을 출력합니다.");
		System.out.println("이름 : " + c1.getName());
	}

}
