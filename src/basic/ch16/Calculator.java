package basic.ch16;
/**
 * 메서드 오버로딩이란?
 * 같은 이름의 메서드를 여러 개
 * 정의하는 것을 말한다.
 */
public class Calculator {
	
	// 덧셈 메서드 생성(인트 2)
	public int add(int a, int b) {
		return a+b;
	}
	// 덧셈 메서드 생성(더블2 )
	public double add(double a,double b) {
		return a+b;
	}
	// 덧셈 메서드 생성(인트 3)
	public int add(int a,int b,int c) {
		return a+b+c;
	}
	// 덧셈 메서드 생성(스트링2)
	public String add(String a,String b) {
		return a+b;
	}

}
