package basic.ch02;

public class triangleareacalculator {
	public static void main(String[] args) {
		
		final double TRIANGLE;
		final double VERTICAL;
		
		TRIANGLE=7;
		VERTICAL=9;
		
		double area;
		area=(TRIANGLE*VERTICAL)/2;
		
		//문자열의 데이터 타입=string
		//결과값이 문자열로 출력된다.
		System.out.println("삼각형의 넓이 : "+area);
	}//end of main

}//end of main
