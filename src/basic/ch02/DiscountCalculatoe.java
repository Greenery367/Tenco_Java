package basic.ch02;
/**
 * 관계, 비교 연산자
 * 연산의 결과 값이 무조건 true,false 중 하나로 반환된다.
 */
public class DiscountCalculatoe {
	public static void main(String[] args) {
		int num1=5;
		int num2=3;
		
		//관계 연산자를 주어로 바라보자.
		boolean value=num1>num2; //연산 결과가 true 혹은 false로 나오니 때문에
		//boolean 타입으로 한다.
		System.out.println(value); //5>3이므로, true 값이 출력된다.
		
		System.out.println(3<5);
		System.out.println(3>=10);
		System.out.println(3<=3);
		System.out.println(3==5);
		System.out.println(3!=2);
		System.out.println("------------------------");
		
		//num1=5 num2=3
		System.out.println(num1<num2);//f
		System.out.println(num1>=num2); //t
		System.out.println(num1<=num2); //f
		System.out.println(num1==num2); //f
		System.out.println(num1!=num2); //t
		
	}//end of main

}//end of class
