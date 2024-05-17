package basic.ch02;

public class constant {
    //메인 함수-코드의 시작점
	public static void main(String[] args) {
	    /**
	     * 1. 상수(Constant): 변하지 않는 수를 말한다. 
		-반드시 값이 초기화되어야 하고, 한 번 초기화되면 변경할 수 없게 하는 메모리 공간을 의미하기도 한다.
		이런 특징 때문에 원주율, 1년의 12개월, 최대 사용자 수 등의 변하지 않는 수(고정된 수)를 표현할 때 사용된다.
		자바에서 상수를 선언할 때는 final이라는 예약어를 사용한다. 
		-상수는 일반적으로 대문자로 표현한다. (연결은 _ 언더바를 이용한다.)
		-상수는 한 번 값을 선언하면 변경할 수 없다. 
		-상수는 선언 한 뒤 한 번은 초기화 해야한다.
		
		컴파일 시점과 런타임 시점
		
		-명령어 java는 프로그램을 실행시키는 명령어이다.
		-명령어 javac는 번역하는 과정이다.
		
		지금 우리가 자바 언어로 코드를 작성하고 있어요.
	    JDK 도구를 설치해야 자바 프로그래밍이 가능합니다.->여러 도구들이 존재
	    JDK->JRE(Java Rumtime Enviropment)=자바 프로그램 실행 환경
	    JRE->JVM(Java Virtual Machine)=자바 가상 머신
	    JVM->.clss파일을 실행시켜주는 녀석이다. 
	    JVM은 어떤 연산을 거쳐 이진코드(바이너리 파)로 변환 시켜서 수행하는 녀석이다.
	    
	    컴파일러=번역기
	    컴파일 시점->.class 파일을 만들어 내는 과정(javac.명령어 동작)
	    런타임 시점->ctrl+F11 프로그램 실행~실행 종료 까지
	    ex: 네이버처럼 활발히 사용중인 프로그램은 계속 런타임 中
	    
	     *
//	     */
//		//상수 선언--> 값이 한 번 정해지면 변경할 수 없는 수
		final int MAX_NUM=10;
		final int MIN_NUM;
//		MIN_NUM=0;
//		MAX_NUM=55;
//		ctrl+s를 누르면 IDE 툴이 javac Constant.java 명령어를 수행한다.
//		명령어의 결과로 Constant.clss 파일이 생성된다.
//		Why? JVM이 이해할 수 있는 언어이기 때문에 번역을 해주어야 한다. 
		
		System.out.println("----------------------------------");
		
		//원주율 상수로 선언
		final double PI=3.14159;
		//원의 반지름을 상수로 선언하자.
		final int RADIUS=10;
		
		//원의 둘레를 계산하는 공식
		//2x원주율x반지름=원의 둘레
		System.out.println(2*PI*RADIUS);
		
		//원의 면적을 계산하는 공식
		//원주율x반지름x반지름=원의 면적
		System.out.println(PI*RADIUS*RADIUS);
		
		//일상 속에서 사용하는 상수와 프로그래밍 속에서 사용하는 상수는
		//서로 다른 상수이다. 
		//그렇기에 일상 속에서 사용하는 상수는
		//프로그래밍 시에는 상수가 아닌 다른 이름으로 불러야 한다.
		
		
		//리터럴(Literal)
		//리터럴은 우리 일상 속에서 사용하는 상수를 의미한다.
		//리터럴은 고정된 값을 직접 나타내는 데이터이다.
//		변수나 상
	
		
	
	}//end of main

}//end of class