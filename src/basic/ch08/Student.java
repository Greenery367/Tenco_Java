package basic.ch08;

public class Student {
	
	// 생성자 - constructor
	// 객체를 생성할 때, 즉 메모리에 올릴 때
	// 다음과 같은 모양으로 만들라고 "강제"로 지시하는 것.
	// 생성자는 객체를 생성할 때 반드시 존재해야 한다.
	
	String name;
	int number;
	int grade;
	
	// 생성자는 return 타입이 없다!
	// 클래스 이름과 같다면 (심지어 대문자 시작도 같다)
	// 생성자라고 부를 수 있다.
	public Student() {} // <- 기본 생성자
	// 기본 생성자는 컴파일러가 .class 파일을 만들 때
	// 사용자 정의 생성자가 하나도 없다면 
	// 자동으로 코드를 넣어 준다.
	
	// 사용자 정의 생성자란 무엇일까?
	// 클래스 설계자가 인스턴스화 했을 때,
	// 정상적으로 동작해야하는 초기값들이 필요하다면
	// 강제성을 부여하는 것이다. 
	
	public Student(String s, int n1, int n2) {
		name=s;
		number=n1;
		grade=n2;
		showInfo();
	}
	
	// 중요 별표 3개
	// 생성자는 객체가 처음 만들어 질 때
	// 제일 먼저 수행하는 코드이다. 
	
	// 메서드 정의
	public void showInfo() {
		System.out.println("학생의 이름은 : " + name);
		System.out.println("학생의 학번은 : " + number);
		System.out.println("학생의 학년은 : " + grade);
	}
	
} // end of class
