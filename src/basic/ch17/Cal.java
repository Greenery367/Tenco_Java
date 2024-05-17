package basic.ch17;

public class Cal {
	public Cal() {
		System.out.println("Cal() 부모 생성자 호출");
	}

	public int sum(int a, int b) {
		return a + b;
	}

	public int multiply(int a, int b) {
		System.out.println("2. 호출");
		System.out.println("여기는 부모 클래스 메서드입니다.");
		return a * b;
	}

	public static void main(String[] args) {
		// 코드 테스트
		Cal2 newCal2 = new Cal2();
		System.out.println(newCal2.sum(5, 3)); // 5+3->8
		System.out.println(newCal2.minus(10, 3)); // 10-3->7
		System.out.println(newCal2.multiply(10, 0)); // 10*0->0
	} // end of main

} // end of class

class Cal2 extends Cal {
	public Cal2() {
		System.out.println("Cal2() 자식 생성자 호출");
	}

	public int minus(int a, int b) {
		return a - b;
	}
	// 원시 코드(부모 코드)의 기능을 변경하고 싶다면 = 재정의하다
	// 오버라이드 처리 한다.
//	public int multiply(int a, int b) {
//		// a or b: 둘 다 조건이 부합하는 것. -> 논리합: 둘 중 하나라도 트루라면, 트루.
//		// a and b: 둘 모두가 부합하는 것. -> 논리홉: 둘 모두가 트루여야 트루.
//		if(a==0 || b==0) {
//			System.out.println("0을 입력하지 마시오.");
//		}
//		System.out.println("자식클래스에서 호출된 multiply 메서드");
//		return a*b;

	@Override // <-어노테이션(주석+힌트)
	public int multiply(int a, int b) {
		System.out.println("1. 호출");
		return super.multiply(a, b);
	}
//	}

}