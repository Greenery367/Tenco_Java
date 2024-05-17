package basic.ch06;
import java.util.Scanner;
public class Function2 {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("");
		String name=sc.next();
		
		// 1. 인삿말 출력하기 - 테스트
		greet("홍길동");

		// 2. 제곱 계산하기 - 테스트
		int squareTest = square(11);
		System.out.println(squareTest);

		// 3. 나이 확인하기 - 테스트
		System.out.println(checkAdult(16));

		// 4. 수의 부호 판별 - 테스트
		System.out.println(signOfNumber(-11));

		// 5. 최대값 찾기 함수 - 테스트
		int testFindMax = findMax(21, 17);
		System.out.println(testFindMax);

	}// end of main

	// 1. 인삿말 출력하기
	static void  greet(String name) {
		System.out.println("안녕하세요, [" + name + "]님!");
	}

	// 2. 제곱 계산하기
	static int square(int a) {
		int times = (a * a);
		return times;
	}

	// 3. 나이 확인하기
	static boolean checkAdult(int age) {
		boolean checkAge;
		if (age >= 18) {
			 checkAge = true;
		} else {
			 checkAge = false;
		}
		
		return checkAge;
	}

	// 4. 수의 부호 판별
	static String signOfNumber(int number) {
		String answer;
		if (number > 0) {
			answer = "Positive";
		} else if (number == 0) {
			answer = "Zero";
		} else {
			answer = "Negative";
		}
		return answer;
	}

	// 5. 최대값 찾기 함수
	static int findMax(int aNum, int bNum) {
		int maxNum;
		if (aNum > bNum) {
			maxNum = aNum;
		} else {
			maxNum = bNum;
		}
		maxNum=Math.max(aNum, bNum);
		return maxNum;
	}

}// end of class
