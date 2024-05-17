package basic.ch02;

public class TypeConversion {
	//코드의 시작점
	public static void main(String[] args) {
		
		int intDataBox=100; // 4바이트
		double doubleDataBox; //8바이트
		doubleDataBox = intDataBox; // 작은 상자->큰 상자로 들어가는 개념
		
		System.out.println(doubleDataBox);
		
		//강제 형 변환이란
		final double PI=3.14159;
//		int intBox=PI;
		
		//컴파일러가 작은 상자에 큰 상자를 넣을 수 없어!
		//그래도 넣고 싶다! 컴파일러야 괜찮으니까 우겨넣어줘!
		//=강제 형 변환
		
		int intBox=(int)PI; //I'm okay~
		//강제 형 변환 시 데이터의 손실이 발생할 수도 있다. 
		
		System.out.println(intBox);
		//소수점 아래의 숫자들을 버린다. 
		
		
		double interest_rate;
		int discount;
		
		interest_rate=15.5;
		discount=(int)interest_rate;
		
		System.out.println(discount); //15.5에서 0.5가 버려지고, 15가 출력된다.
		System.out.println((int)9.78); //println에서 바로 식을 입력할 수도 있다.
		
		
	}//end of main
}//end of class
