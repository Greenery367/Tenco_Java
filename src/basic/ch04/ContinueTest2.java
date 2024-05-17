package basic.ch04;

public class ContinueTest2 {
	public static void main(String[] args) {
		//코드의 시작점
		
		//화면에 1부터 100까지의 수 중에, 
		//3의 배수를 출력해보세요.
		
		//문제 2.
		//반복문은 while문을 사용하라.
	
		double back=1.1;
		int foward=1;
		foward=(int)back;
		
		int i=1;
		//while 사용하기 - 풀이 1
		while(i < 101) {
			if((i % 3)==0) {
				System.out.println(i + "는 3의 배수입니다.");
			}
			i++; //증감식 사용하기 (무한 반복 예방)
		}
		
		//풀이 2: 특정 조건이 되었을 때, 반복문을 멈추어라.
		
		i=1;
		boolean flag=true;
		while(flag) {
			
			if(i == 100) {
				flag=false;}
			
			if((i % 3)==0) {
				System.out.println(i + "는 3의 배수입니다.");}
			i++;
		}
		
	}//end of main

}
// end of class
