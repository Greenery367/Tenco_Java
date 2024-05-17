package basic.ch03;

public class Operation2 {
	public static void main(String[] args) {
		
		int result1=5+3;
		int result2=5-3;
		int result3=5*3;
		double result4=5.0/3;
		//고민해볼 사항
		//5과 3이 정수로 취급되고 있기 때문에, 자료형을 double로 바꾸어도 값이 1.0이 출력된다.
		//하지만 숫자 뒤에 소수점을 붙여 실수로 만들면, 1.666666...이 출력된다.
		int result5=5%3; //%: 나머지 연산자. 나누기 후에 남은 나머지를 알려준다.
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		
		
		//도전 문제 1. (12+3)/3
		
		int a=(12+3)/3;
		double b=(12.0+3.0)/3;
		System.out.println("정수형 : "+a);
		System.out.println("실수형 : "+b);
		
		//도전 문제 2. (25%2)값을 화면에 출력하라.
		//어떤 수를 2로 나누었을 때 나머지가 0이면 짝수, 1이면 홀수.
		
		double ect=25.0%2;
		int real=25/2;
		
		System.out.println("25 나누기 2 = "+real);
		System.out.println("나머지는? "+ect);
		
		//도전문제 3. 15를 4로 나눈 후, 그 결과와 절대값을 출력해보자.
		Math math;
		 
		int num1=15/4;
		double num2=Math.abs(num1);
		
		//도전문제 4. 문제를 직접 만들어보자.
		//한 반에 30명의 아이들이 있다. 
		//나누어 줄 수 있는 딸기의 개수는 66개, 토마토의 개수는 44개이다. 
		//각각의 아이들에게 딸기와 토마토를 각각 5개, 2개씩 나누어줘야 한다면
		//받을 수 있는 아이와, 받지 못하는 아이들의 수는 몇 명일까?
		
		final int CHILD=30;
		final int STRAW=66;
		final int TOMATO=44;
		
		int tomato_can=TOMATO/2;
		int straw_can=STRAW/5;
		
		int tomato_lack=CHILD-tomato_can;
		int straw_lack=CHILD-straw_can;
		
		System.out.println("현재 토마토를 받을 수 있는 아이는 "+ tomato_can+"명 입니다.");
		System.out.println("현재 딸기를 받을 수 있는 아이는 "+straw_can+"명 입니다.");
		System.out.println("현재 토마토를 받지 못한 아이는 "+tomato_lack +"명 입니다.");
		System.out.println("현재 딸기를 받지 못한 아이는 "+ straw_lack +"명 입니다.");
		
		int tomato_need=tomato_lack*2;
		int straw_need=straw_lack*5;
		
		System.out.println("앞으로 토마토가 " + tomato_need + "개 더 필요합니다.");
		System.out.println("앞으로 딸기가 "+straw_need+"개 더 필요합니다.");
		
		
		
	}//end of main

}//end of class
