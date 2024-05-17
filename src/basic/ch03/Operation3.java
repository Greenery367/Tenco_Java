package basic.ch03;
/**
 * 
 * 증가, 감소 연산자
 * 변수에 접근해서 그 값을 조직 1증가 또는 감소시킨다.
 */
public class Operation3 {
	public static void main(String[] args) {
		
		int value1=1;
		value1++; 
		++value1; //앞, 뒤에 관계 없이 결과는 같다.
		
		System.out.println(value1);
		
		//변수에 접근해서 -1 감소시키기.
		int value2=1;
		value2--;
		
		System.out.println(value2);	
		//증감 연산자가 변수 뒤에 올 때(=후위 연산자)
		int intData1=10;
		int resultData;
		
		resultData=intData1++;
		System.out.println(resultData); //결과값: 10  예상: 11
		//후의 연산자는 ;기준으로 동작한다.
		System.out.println(intData1); //;세미콜론 기준으로 끝나고, 변수에 접근해서 1을 증가시켰다.
		
		//증감 연산자가 변수 앞에 올 경우 전위 연산자라고 부를 수 있고,
		//변수 뒤에 올 경우 후위 연산자라고 부를 수 있다.
		//-->전위 연산자를 가능한 사용하자!
		
		int intData2=100;
		int resultData2;
		
		resultData2 = ++intData2;
		System.out.println(resultData2);
		//결론: 증감 연산자는 변수의 값을 오직 1증가시킬 때 사용한다.
		//항의 앞, 뒤 위치에 따라 연산의 순서가 다르다.
	}

}
