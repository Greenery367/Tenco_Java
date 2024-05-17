package basic.ch14;

public class ArrayTest1 {
	public static void main(String[] args) {
		// 함수의 시작

		// 배열이란?
		// 연관된 데이터를 모아서 통으로 관리하기 위한 데이터 타입!

		// 배열의 특징(중요!!)
		// 배열은 사용하기 전에 반드시 몇 개의 데이터가 들어갈지
		// 크기를 지정해야 사용할 수 있다.

		// 배열 메모리 공간 만들기
		int[] numbers = new int[3]; // 배열 선언 후 초기화
		int intBox[] = new int[5]; // 두 가지 방식 모두 가능하다.
		
		// 값 초기화하기
		numbers[0]=1000;
		numbers[1]=1001;
		numbers[2]=1002;
     	// numbers[3]=1003; -> 인덱스의 길이를 벗어나 오류 발생.
		// 사전 기반 지식 -> 모든 프로그래밍 인덱스 번호는 0부터 시작된다.
		
		// 배열의 선언과 동시에 초기화
		int[] grades=new int[] {5,3,2};
		int[] grades1= {5,3,2};
		
		// 문제 1
		// 다섯 개의 크기를 가지는 double 타입의 배열을 선언하시오.
		// 단 배열의 이름은 자유롭게 작성하시오.
		double[] doubleBox=new double[3];
		double [] arrayD=new double[5];
		
		
		// 문제 2
		// 위에서 선언한 배열의 값을 인덱스 0~2까지 초기화하시오.
		// 값은 아무거나 상관 없음
		doubleBox[0]=0.0;
		doubleBox[1]=1.1;
		doubleBox[2]=2.2;
		arrayD[0]=10;
		arrayD[1]=11; // 자동 형변환이 이루어진다.
		arrayD[3]=1.3;
		// 값을 입력하지 않으면 기본 값(0.0, 0, null 등)으로 입력된다.
		
		
		// 문제 3
		// String 타입의 배열을 선언, 크기는 3,
		// 선언과 동시에 초기화하세요.
		String[] stringBox={"딸기","바나나","포도"};
		String[] strArray={"밀크티","커피","허브티"};
		

	} // end of main

} // end of class
