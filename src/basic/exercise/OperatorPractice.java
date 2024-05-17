package basic.exercise;

public class OperatorPractice {
	// 코드의 시작점
	public static void main(String[] args) {
		// 1. intData와 doubleData을 덧셈 연산 하여 result1 변수에 담고
		// 결과값 30.5를 출력 하세요.

		int intData = 10;
		double doubleData = 20.5;

		double result1 = intData + doubleData;
		System.out.println("문제 1. 두 수의 합은 " + result1 + "입니다.");
		// result1 변수명으로 사용

		// 2. result1 변수를 정수형으로 강제 형 변환 해서 출력하세요
		result1 = (int) result1; // 강제 형 변환 시에는 선언(자료형) 없이 이름만 선언한다.
		System.out.println("문제 2. 정수형으로 강제 형 변환된 값은 " + (int) result1 + "입니다.");

		// 3. intData 변수에서 -1을 뺀 후 출력하세요
		--intData; // 증감연산자는 대입연산자 굳이 안 써도 된다.
		System.out.println("문제 3. intData에서 1을 뺀 값은" + intData + "입니다.");

		// 4. doubleData 변수에 값을 -20.5로 출력 하세요
		// 단, doubleData 값을 변경하지 마세요
		doubleData = -doubleData; // 부호 연산자를 알고 있는가?
		System.out.println("문제 4. doubleData(20.5)의 부호를 바꾼 값은 " + doubleData + "입니다.");

		// 5. 변수 intData 와 doubleData, 관계 연산자를 사용해서
		// result2 변수에 값을 true 담기도록 식을 만들고 만들고 출력하세요
		boolean result2 = intData > doubleData;
		System.out.println("문제 5. result2(intData>doubleData)의 값은 " + result2 + "입니다.");

		int num1 = 10;
		int num2 = 30;

		// 6. 변수 result3 을 선언하고 num1과 num2 변수가 합이
		// 숫자 50보다 큰지 논리 연산자를 사용해서 결과를 담고 출력하세요
		boolean result3 = (num1 + num2) > 50;
		System.out.println("문제 6. num1과 num2의 합은 50보다 클까? (10+30) " + result3);

		// 7. num1과 num2 값 중 큰 수를 삼항 연산자를 사용해서
		// max 변수에 값을 담고 출력해주세요

		// 조건식 ? 결과1:결과2;
		int max = num1 > num2 ? num1 : num2;// num1,num2를 담는 변수이기에 max는 int형 변수가 된다.
		System.out.println("문제 7. num1(10)과 num2(30) 중 더 큰 수는 " + max + "입니다.");

	}// end of main

}// end of class
