package basic.ch03;
/**
 * 
 * 복합 대입 연산자란
 * 대입 연산자와 다른 연산자가 함께 쓰이는 것.
 */
public class Operation4_1 {
	public static void main(String[] args) {
		int num1=0;
		num1+=2;
		System.out.println(num1);
		
		int num2=0;
		num2-=2;
		System.out.println(num2);
		
		int num3=1;
		num3*=3;
		System.out.println(num3);
		
		int num4=10;
		num4/=2;
		System.out.println(num4);
		
		int num5=5;
		num5%=3;
		System.out.println(num5);
	}//end of main

}//end of class
