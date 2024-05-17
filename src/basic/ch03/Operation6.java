package basic.ch03;
/**
 * 
 * 논리 연산자
 * 관계 연산자와 혼합하여 많이 쓰인다.
 * 연산의 결과는 오직 True, False로 반환한다.
 */
public class Operation6 {
	public static void main(String[] args) {
		
		//논리 연산자는 3가지 종류가 있다.
		//논리 곱 (&&: 엠퍼센트 2개)
		//논리 합 (||: 버티컬 바 2개)
		//부정 (!: 느낌표 1개)
		
		int num1=10;
		int num2=20;
		
		//1. 논리곱(&&) 
		//              True  &&  True
		//논리곱은 전부 True여야 True를 반환합니다.
		//하나라도 거짓이면 False를 반환합니다.
		boolean flag1=(num1>0)&&(num2>0);
		System.out.println("flag1 : "+flag1);
		
		//두번째 항이 거짓(false)이기 때문에, false가 출력된다.
		boolean flag2=(num1>0)&&(num2<0);
		System.out.println("flag2 : "+flag2);
		
		System.out.println("----------------------------");
		
		//2. 논리합(||)
		//논리합은 두 항 중 하나만 참이어도 T를 반환한다.
		boolean flag3=(num1>0)||(num2<0);
		System.out.println("flag3 : "+flag3);
		
		System.out.println("----------------------------");
		
		//3. 부정(!)
		System.out.println(!flag3);
		System.out.println(flag3);
		//연산의 결과가 어떻게 될까?->확인해봐야지=로깅
		//부호 연산자와 논리 연산자 모두 원본 변수를 변경하는 것은 아니다.
		
	}//end of main

}//end of class
