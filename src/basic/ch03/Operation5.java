package basic.ch03;
/**
 * 
 * 복합 대입 연산자란
 * 대입 연산자와 다른 연산자가 함께 쓰이는 것.
 */
public class Operation5 {
	public static void main(String[] args) {
		int score=5;
		score+=10;
		System.out.println("점수 확인: "+score);
		//복합 대입 연산자를 통해, 
		//변수에 10을 더한 값을 변수 score에 대입했다. 
		// score(15)=5+10;
		
		score+=10;
		score=score+10; 
		
		System.out.println("----------------------------");
		
		int n1=100;
		//n1이라는 변수에 접근해서 기존에 있는 값에 추가로 10을 더해주세요.
		
		//n1=n1+10; 
		n1+=10;
		System.out.println(n1);
		//기존 n1에 10을 더한 값이 n1에 다시 대입되어, 110이 출력된다.
		
		//score 변수에 접근해서 10점 감소시켜주세요.
		score=score-10;
		score-=10; //둘은 같은 코드다.
		
		//score 변수를 두 배 곱해주세요.
		score=score*2;
		score*=2;
		
		//score을 2로 나눠주세요.
		score=score/2;
		score/=2;
		
		//score를 2로 나누고 그 나머지를 구해주세요.
		score=score%2;
		score%=2;
		
		
		
		
		
	}//end of main

}//end of class
