package basic.ch04;
import java.util.Scanner;
public class WhileTest2 {
	public static void main(String[] args) {
	//start=0;
	//end=사용자가 입력한 값;
	//화면에 0부터 사용자가 입력한 값까지 반복해서 출력하시오.
		
		boolean flag=true;//flag=깃발
		//특정 조건일 때 반복문을 종료시켜 보자.
		
		int start=1;
		int end=3;
		
		while(flag) {
			if(start ==end) {
				System.out.println("if 구문이 동작함");
				flag = false;
				return;
			}
			System.out.println("start : " + start);
			start++;
		}
		
		//while문은 순서를 바꾸는 것에 의해 결과가 달라지기도 한다.
		//while문은 if문과 자주 같이 쓰인다.
	}//end of main

}//end of class
