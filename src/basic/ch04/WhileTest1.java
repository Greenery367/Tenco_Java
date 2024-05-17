package basic.ch04;

public class WhileTest1 {
	public static void main(String[] args) {
		// 코드의 시작점
		
		// 1부터 10까지 콘솔창에 숫자를 출력하고 싶어!
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println(10);
		
		System.out.println("--------------");
		
		// 기준이 되는 숫자 x가 11보다 작을 동안
		
		int i=1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}//end of while
		

	}// end of main

}// end of class
