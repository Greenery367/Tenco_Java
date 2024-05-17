package basic.ch03;
/**
 * 빠른 평가란?
 * 논리 연산에 있어 첫 번째 조건이 결과를 결정할 때,
 * 두 번째 조건을 평가하지 않는 것을 의미한다.
 */
public class Operation7 {
	public static void main(String[] args) {
		
		int num=5; //변수의 선언과 동시에 초기화한다.
		int index=0;
		
		//빠른 평가가 동작하는 식을 만들어보자.
		//                  15<10->False       2<10->True
		boolean result=((num=num+10)<10)&&((index=index+2)<10);
		System.out.println("현재 number 변수의 값은 : "+result);
		System.out.println("현재 index 변수의 값은 : "+index);
		//빠른 평가로 인해 index=index+2가 실행되지 않았으므로, 
		//index의 값은 여전히 0이다.
		
		//number 값 재설정
		num=5;
		//논리합을 이용한 빠른 평가 식을 만들어보자.
		//      15<10 -->False   ||   2<10 -->True
		result=((num=num+10)<10) || ((index+=2)<10);
		
//		//문제: 현재 num과 index에 담겨 있는 값은 무엇일까?
//		System.out.println(num);
//		System.out.println(index);
		//논리합의 경우, 항 중 하나만 참이어도 True가 출력되기 때문에
		//빠른 평가가 실행되지 않아, index의 값이 2로 변경된다.
		
		result=((index+=2)<10 || (num=num+10)<10);
		System.out.println(num);
		System.out.println(index);
		//이 경우, (index+=2)<10의 결과가 True이기 때문에
		//뒤의 항들이 어떤 값이 오든, 변수 result의 값은 True가 된다. 
		//이 경우, (index+=2)<10의 값 만으로도 True로 결정되어 빠른 결정이 실행된다.
		//때문에 num=num+10이 실행되지 않아 num의 값은 그대로 15이다. 
		
	}//end of main

}//end of class
