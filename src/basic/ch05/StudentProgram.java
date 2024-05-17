package basic.ch05;

public class StudentProgram {

	public static void main(String[] args) {
		
		int n1=1;
		double d1=5.0;
		
		Student student1 = new Student();
		Student student2 = new Student();
		
		// 프로세스: 프로그램이 메모리를 할당받는 것.
		// 코드 작성 후 실행 시(런타임) 
		
		// stack
		// 컴파일러가 변수를 받으면, main이라는 메모리 공간을 할당받는다.
		// 대문자로 시작하는 자료형=참조 타입(Reference Type)
		// 참조 타입 = 변수 괄호 안에 변수명이 아닌, 주소 값이 들어간다. 
		
		// 동적 메모리 영역 (Heap)
		// 참조 타입은 주소값을 통해 '힙'이라는 동적 메모리 공간에 들어가게 된다. 
		// 참조 타입은 주소값이 메인에 담김 -> 주소값을 통해 힙에 객체 속성이 저장된다.
		
		// . 연산자를 통해서 접근할 수 있다.
		
		student1.name ="홍길동";
		student2.name ="이순신";
		//콘솔창에 student1(변수에 연결되어 있는 객체의 이름을 출력해보자.)
		
		System.out.println(student1.name);
		System.out.println(student2.name);
		
		System.out.println(student1); // 참조 타입을 출력하면 주소값이 출력된다.
		System.out.println(student2); // 
	} // end of main

} // end of class
