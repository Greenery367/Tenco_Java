package basic.ch08;

public class StudentMainTest {
	public static void main(String[] args) {
		// 코드의 시작점
		
		Student s1 = new Student("홍길동", 101, 3); //메모리에 올라간 것=객체
		
		// 연습 문제
		// s2 참조 변수에 이름으로 학생을 메모리에 올리고
		// 호출해주세요.
		Student s2 = new Student("임꺽정", 222, 11);
		
		// 변수에 직접 접근해서, 값을 초기화해보자.
		// 단, 기본 생성자 주석을 풀자.
		Student s3=new Student(); // 기본 생성자로 메모리 올림
		s3.name="신사임당";
		s3.grade=2;
		s3.number=113;
		s3.showInfo();
		
		//  생성자를 여러개 만들어 줄 수 있다.
		// 이를 생성자 오버로딩이라고 한다.
		
	} // end of main
	
} // end of class
