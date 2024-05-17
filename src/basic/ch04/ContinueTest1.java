package basic.ch04;

public class ContinueTest1 {
	public static void main(String[] args) {
		//코드의 시작점
		
		//화면에 1부터 100까지의 수 중에, 
		//3의 배수를 출력해보세요.
		
		//반복문은 for문을 사용하라.
		

		
		for(int i = 1; i < 101; i++) {
			if((i % 3) == 0) {
				System.out.println( i + "는 3의 배수입니다.");
			}
		}
		
	}//end of main

}//end of class
