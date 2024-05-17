package basic.ch01;
/**
 * <-여러 줄 주석
 * 변수란 뭘까?
 * 변하는 수(변할 수 있는 데이터)
 * 데이터(값)을 담을 수 있는 메모리 공간(상자)
 */
public class variable {

	//코드의 시작점(메인 함수)
	public static void main(String[] args) {
		//변수를 활용하는 3가지 유형
		//1.변수를 선언
		int ageBox; //정수값을 담을 수 있는 상자를 선언.
		int telBox; //정수값을 담을 수 있는 상자를 선언.
		//프로그램을 실행시키면, RAM에 저장된다. (변수의 선언, 상자 만들기)
		
		//2. 변수에 값을 넣기 
		//값을 넣는다는 건 초기화와 같다.
		ageBox=30;
		telBox=300;
		
		//3. 변수를 사용하기
		System.out.println(ageBox);
		ageBox=telBox; //ageBox의 값이 300이 된다.
		System.out.println("after --> ageBox:"+ageBox);
		System.out.println("-------------------");
		System.out.println(telBox);
		
		//변수를 선언할 때 규칙이 있습니다.
		//

	}//end of main

}//end of class
