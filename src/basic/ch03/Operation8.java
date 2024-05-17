package basic.ch03;

//수입하다, 가지고 오다
import java.util.Scanner;

public class Operation8 {
	public static void main(String[] args) {
		
		System.out.println("입력 받은 두 수 중에 큰 수를 출력하세요");
		
		//자바의 특징->풍부한 라이브러리를 지원한다.
		//JDK->표준 라이브러리(자바 개발자들이 만든 도구)를 사용해보자.
		//데이터 타입(특징 :)
		//콘솔창에서 사용자가 키보드로 입력한 값을 받아주는 녀석이다.
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt(); //사용자가 입력한 정수값을 받아주는 녀석
		System.out.println("x의 값은 : "+x);
		int y=sc.nextInt();
		System.out.println("y의 값은 : "+y);
		
		System.out.println("--------------");
		
		//조건식 ? 결과1 : 결과2;
		int max=x>y ? x:y;
		System.out.println("두 수 중에 큰 수는"+max+"입니다");
		
		//자원 닫기
		sc.close();
	}//end of main

}//end of class
