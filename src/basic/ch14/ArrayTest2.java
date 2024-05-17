package basic.ch14;

public class ArrayTest2 {
	public static void main(String[] args) {
		
		String[] names=new String[5]; // 다섯 칸 짜리 메모리 공간 할당
		
		// 생성 Create
		names[0]="김씨";
		names[1]="나씨";
		names[2]="박씨";
		// names[3],[4]=null
		//[]-인덱스 연산자		
				
		
		// 조회 Read
		System.out.println(names); //주소값이 출력된다.
		System.out.println(names[0]); //인덱스의 값을 따라 변수가 출력된다.
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]); //인덱스 3, 4는 초기화되지 않았기 때문에, null이 뜬다.
		System.out.println(names[4]);
		
		
		// 수정 Update
		names[0]="Mr.Kim";
		names[1]="Mr.Na";
		names[2]="Mr.Park";
		
		
		// 삭제 Delete
		names[0]=null;
		names[1]=null;
		names[2]=null;
		
		
		// 자바에서 null 값은 할당 되지 않은 상태를 의미합니다.
		// Object 타입에서 사용이 가능합니다.
		
		// 1단계
		// 배열의 길이와 인덱스 길이에 대한 이해-> 인덱스의 길이는 n-1이다.
		System.out.println("배열의 크기 : "+names.length);
		System.out.println("인덱스의 크기(n-1) : "+(names.length -1));

		
		// 문제 2
		// 배열의 크기가 50개이면, 인덱스의 길이는 얼마인가? -> 0~49
		// 배열의 크기가 100개이면, 인덱스의 길이는 얼마인가? -> 0~99
		// 배열의 크기가 375개이면, 인덱스의 길이는 얼마인가? -> 0~374

	} // end of main

} // end of class
