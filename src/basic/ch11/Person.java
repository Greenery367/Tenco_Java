package basic.ch11;

public class Person {
	// this의 세 가지 사용방법
	// 1. this는 자기 자신을 가리킨다.(인스턴스의 주소)
	// 2. 생성자에 다른 생성자를 호출할 때 사용할 수 있다.

	// 변수-> private(필수)

	private String name;
	private int age;
	private String phone;
	private String gender;

	// 생성자
	// 메서드는 이름이 같으면 가장 가까운 변수를 사용한다.
	// 매개변수를 설계할 때, 멤버변수와 이름을 다르게 한다.

	public Person(String name, int age) {
		// 자기 자신의 멤버변수 name에 외부에서 들어오는 지역변수 name을 대입한다.
		this.name = name;
		this.age = age;
	}

	public Person(String name, int age, String phone) {
		// 생성자에서 다른 생성자를 호출할 수 있다.
		this(name, age);
		this.phone = phone;
	}

	public Person(String name, int age, String phone, String gender) {
		this(name, age, phone);
		this.gender = gender;
	}

	// 3. 자신의 주소값을 반환시킬 수 있다.
	public Person getPerson() {
		// 자신의 주소값을 반환시킨다.
		return this;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getPhone() {
		return this.phone;
	}
	
	public String getGender() {
		return this.gender;
	}

	public void showInfo() {
		System.out.println("이름 : " + name + " 나이 : " + age);
	}

	// 연습 문제
	// 1. setName 메서드 만들기(setter)
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	public void setPhone(String phone) {
		this.phone=phone;
	}
	public void setGender(String gender) {
		this.gender=gender;
	}

	
}
