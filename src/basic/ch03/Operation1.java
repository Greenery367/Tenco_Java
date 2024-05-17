package basic.ch03;

/**
 * 부호 연산자
 * 단항 연산자라고도 불린다. 
 * 변수의 부호를 변경(리터럴 값의 부호를 변경한다.)
 */
public class Operation1 {
	
	public static void main(String[] args) {
		int intData=1000;
		System.out.println(+intData);
		System.out.println(-intData);
		System.out.println(intData);
		//반드시 기억->변수의 실제 값이 변경된 것은 아니다. 
		//메모리 공간 안에 실제 값을 변경하려면 어떻게 해야할까?
		//답은-->대입 연산자와 함께 사용해야 한다. 
		
		intData=-intData;
		System.out.println("실제 변수 안에 들어 있는 값 : "+intData);
		
		//연습
		int one=1;
		final int ZERO=0; //상수를 쓸 때는 대문자를 권장한다.
		int current=0;
		
		current=ZERO-(3*one);
		System.out.println(current);
		System.out.println(-current);
		//currentPosition값이 양수였다면
		//부호연산자를 통해 변경하면, 절대값이 달라지게 된다.
		
		//우리는 절대값을 구하는 알고리즘을 만들어야 한다.
		
		Math math; //자바 개발자들이 이미 만들어 둔 도구이다.
		//수학과 관련된 기능들의 모음이다.
		System.out.println("Math 라이브러리 사용 : "+Math.abs(current));	
		//Math.abs() : 괄호 안의 값의 절대값을 구한다. 
		
		
		//ZERO_POINT에서 왼쪽으로 3칸 이동한 값을 출력하시오.
		
		//절대값이란?
		//절대값이란 어떤 수의 크기를 나타내는 것으로
		//그 수가 0에서 얼마나 떨어져 있는지를 표시합니다.
		
		//어떤 수의 절대값은 그 수가 음수이든 양수이든 상관 없이, 항상 양수입니다.
		//0의 절대값은 0이다.
		
		
		
	}//end of main

}//end of class
