package basic.ch04;

//변수명을 작성할 때의 약속 (권장 사항)->코딩 컨벤션
//int myScore;  <-카멜 표기법(카멜 노테이션)
//낙타의 등처럼, 대문자가 들어갈 때 들쭉날쭉해지는 모습을 보고 이름붙여졌다.

//첫 시작의 단어를 대문자로 작성하고, 연결하는 단어도 대문자로 표기한다면
//-> 파스칼 케이스 

public class IfElseFactor {
	//코드의 시작
	public static void main(String[] args) {
		
		// 조건문(제어문) if
		// 주어진 조건에 따라서 실행이 이루어지도록 흐름을 만든다.
		// if .... -> 만약 ....이라면
		
		boolean flag = true;
		if(flag) {
			System.out.println("너, 출력됨! ^^");
			// 수행 구문 - 블록의 범위를 기억하자!
			flag=false;
		} //end of if
		
		System.out.println("코드가 여기까지 내려 옵니다. :"+flag);
		
	}//end of main
}//end of class
