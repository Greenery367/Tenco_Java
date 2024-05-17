package basic.ch11;

public class PersonTest {
	public static void main(String[] args) {
		Person person1 = new Person("홍길동", 100);
		Person personBox = person1; // Person 클래스 내부의 객체는 현재 1개이다.
		// 현재 객체 person1은 스택에 주소값, 힙에 변수값이 저장되어 있다.
		// 하지만 personBox는 주소값을 할당받았기 때문에, 변수값이 따로 없으며
		// heap 내의 person1의 값을 링크하고 있다!

		// 위 코드까지는 Heap 메모리 영역에 객체가 2개 생성된 상태이다.
		// 지역변수인 person1, personBox는 같은 객체를 가리킨다.

		// 연습 문제
		// 1. setName 메서드 만들기

		Person personLee = new Person("이순신", 101);
		// 이 코드가 어떤 의미를 지니는지 한 줄 한 줄 주석을 달면 빨리 는다.

		// 2. 홍길동의 이름을 setter 메서드를 이용해 팀으로 바꿔라.

		person1.setName("티모");
		person1.showInfo();
		personBox.setName("가츠");
		person1.showInfo();

	} // end of main

} // end of class
