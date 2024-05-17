package basic.ch01;
/**
 * 문자 데이터 타입
 * char 자료형의 크기는 2byte 입니다. (16bit)
 */
public class datatype2 {
	public static void main(String[] args) {
		
		//기본 자료형 중 문자 타입(사실은 정수형)
		//문자를 저장하기 위한 변수를 선언할 때 사용합니다.
		//char 타입은 단, 하나의 문자만을 저장할 수 있습니다.
		
		char charBoxa, charBoxb, charBoxc;
		charBoxa='a';
		charBoxb='b';
		charBoxc='c';//char 타입은 쌍따옴표가 아닌 홑따옴표('')를 사용한다.
		
		//charBox='가나'; //대입 불가
		
		//참고! 두 개 이상의 문자가 연속된 형태=문자열(String)
		//->쌍따옴표를 사용해 표현한다. (ex: "안녕! 반가워!")
		
		System.out.println("-------------------------------------");
		
		System.out.println((int)charBoxa);
		System.out.println((int)charBoxb);
		System.out.println((int)charBoxc);//강제형변환
		
		//문자 자료형도 데이터인데, 저장될 때는 어떻게 저장될까?
		//->컴퓨터에서 문자를 표현, 처리하기 위해 문자표(아스키코드)가 사용된다.
		//char형의 알파벳을 int형으로 강제형변환을 하면, 아스키코드에서 대치되는 숫자가 출력된다.
		
		//Unicode
		//UTF-8
		
		
		//디코딩(문자->이진수): 입력받은 값을 아스키코드로 변환하는 과정
		//인코딩(이진수->문자): 변환한 아스키코드를 문자표와 대조하는 과정
		
		
	}//end of main

}//end of class
