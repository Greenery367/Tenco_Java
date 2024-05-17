package basic.ch04;

public class BreakTest {
	public static void main(String[] args) {
		//코드의 시작점
		
		//중간에 멈추는 break문
		//소수 7이면 반복문을 멈추어라.
		for(int i = 1; i < 11; i++ ) {
			if( (i % 7) == 0) { //코드 2
				//break; //중간에 멈추고, 반복문 하나를 빠져 나온다. 
				return;
			}
			System.out.println("i의 값 : "+  i); //코드 1
		}
		
	}//end of main

}//end of class
