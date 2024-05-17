package basic.ch07;

/**
 * 객체의 속성은 멤버 변수로, 객체의 기능은 메서드로 구현한다.
 */
public class StudentMainTest {
	public static void main(String[] args) {
		// 코드의 시작점
		
		Student student1=new Student(); //클래스의 인스턴스화
		
		student1.studentID=1001;
		student1.studentName="샤코";
		student1.address="푸른 언덕";
		
		student1.study();
		student1.breakTime();
		student1.showInfo();
		
		System.out.println("--------------");
		
		Student student2= new Student();
		student2.studentID = 2001;
		student2.studentName = "야스오";
		student2.address = "붉은 언덕" ; 
		student2.showInfo();
		
		// 연습 문제 (메소드를 정의해보자.)
		// 1. 시험을 친다. (studentID+ "학생이 시험을 친다.")
		// 2. 청소를 한다. (studentName+ "학생이 청소를 한다.")
		
		student1.takeTest();
		student2.cleanUp();
		
		
		//참조 타입의 기본형: null
	} // end of main
	
	//함수란...
	//자바에서 객체와 상관없이 독립적으로 기능을 수행하는
	//일련의 코드 묶음이다. 
	static double addDouble(double d1, double d2) {
		return d1+d2;
	}
	
} // end of class
