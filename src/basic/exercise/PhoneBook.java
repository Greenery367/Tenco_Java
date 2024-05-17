package basic.exercise;

public class PhoneBook {

	// 속성 및 기능
	private String name;
	private String number;

	// 사용자 정의 생성자
	public PhoneBook(String name, String number) {
		this.name = name;
		this.number = number;
	}

	// getter 메서드
	public String getName() {
		return this.name;
	}

	public String getNumber() {
		return this.number;
	}

	// setter 메서드
	public void setName(String name) {
		this.name = name;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	// 상태창 보여주기
	public void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + number);
	}

}
