package basic.ch04;

//변수명을 작성할 때의 약속 (권장 사항)->코딩 컨벤션
//int myScore;  <-카멜 표기법(카멜 노테이션)
//낙타의 등처럼, 대문자가 들어갈 때 들쭉날쭉해지는 모습을 보고 이름붙여졌다.

//첫 시작의 단어를 대문자로 작성하고, 연결하는 단어도 대문자로 표기한다면
//-> 파스칼 케이스 

public class IfElseFactor2 {
	//코드의 시작
	public static void main(String[] args) {
		
		int age=17;
		
		if(age<=7) {
			System.out.println("학교에 아직 다니지 않습니다.");
		}
		else if (age<=13) {
			System.out.println("초등학교에 다니고 있습니다.");
		}
		else if (age<=16) {
			System.out.println("중학교에 다니고 있습니다.");
		}
		else {
			System.out.println("고등학교 이상 다니거나 졸업을 했네요.");
		}//end of if
		
		
	}//end of main
}//end of class
