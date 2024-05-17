package basic.ch04;

public class BreakTest2 {
	public static void main(String[] args) {
		//코드의 시작점
		
		// for문 대신에 while문으로 변경해서 결과를 출력해보자.
		
		//문제 1.
		//중간에 멈추는 break문
		//소수 7이면 반복문을 멈추어라.
		

		int i=1;
		
		while(i<11) {
			//단독 if문은 수행이 될 수도, 안 될 수도 있다.
			if((i % 7) == 0) {
				//중간에 멈추어라 -> break
				break;
			}
			System.out.println("i는 " + i + "입니다.");
			i++;
		}
		
		
	}//end of main

}//end of class
