package basic.ch06;

public class Function1 {
	public static void main(String[] args) {
		
		int num1;
		int num2;
		int sum;
		add(10,10);
	
		
	    int result2=calcSum(10,20);
		System.out.println(result2);
		
		int song=calcGrade(90,75);
		System.out.println(song);
	
	}// end of main

	static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}

	// 연습 문제
	// 함수를 수정해주세요.

	// 파라메터 점수를 두 개 받을 수 있게 설계하고,
	// s1, s2 ->
	// 1, 10 ->55

	static int calcSum(int s1, int s2) {
		int sum = 0;
		for (int i = s1; i <= s2; i++) { // 101번 동작하는 함수
			// 0 = 0+1
			// 1 = 1+2
			// 2 = 2+3
			sum = sum + i; // 5050
		}
		return sum;

	}
	
	static int calcGrade(int sub1, int sub2) {
		int totalAverage=(sub1+sub2)/2;
		return totalAverage;
	}


}// end of class
