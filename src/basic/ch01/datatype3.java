package basic.ch01;
/***
 * 실수: 수학적으로 정수가 아닌 숫자를 의미한다.
 * 실수는 소수점 이하의 값을 가질 수 있다.
 * float: 4바이트
 * double: 8바이트
 * 실수형에서는 double이 소수점을 더 많이 표현할 수 있기 때문에, 실수형의 기본 연산 단위이다. 
 */
public class datatype3 {
	public static void main(String[] args) {		
		//기본 데이터 타입
		//참조 타입
		
		//기본 데이터 타입: 실수형
		//float, double
		
		
		float floatBox1=0.5f; //플롯을 의미하는 접미사 f 혹은 F를 적어야 한다.		
		float floatBox2=0.5F; //플롯을 의미하는 접미사 f 혹은 F를 적어야 한다.
		//float은 4바이트 크기이다. 
		
		double doubleBox1=0.123d;
		double doubleBox2=0.12345678d;
		//double은 8바이트 크기다. 실수의 기본 연산 단위이다.
		//double이 소수점을 더 많이 표현할 수 있기 때문에 값의 정확도를 높일 수 있다.
		
		//콘솔창 결과 출력-콘솔창에서는 기본적으로 정확한 데이터 타입을 알 수 없다.
		System.out.println(floatBox1);
		System.out.println(floatBox2);
		
		System.out.println(doubleBox1);
		System.out.println(doubleBox2);
		
		
	}//end of main
}//end of class
