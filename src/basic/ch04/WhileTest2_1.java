package basic.ch04;

public class WhileTest2_1 {
	public static void main(String[] args) {
		//코드의 시작
		
		//1부터 5까지 덧셈연산을 하라.
		
		int start=1;
		int end=5;
		int sum=0;
		
		//1. sum=1+0
		//2. sum=2+1
		//3. sum=3+3
		//4. sum=6+4
		//5. sum=10+5
		//6. start가 6이 되므로 while문 종료
		
		//특정 조건을 만나게 해서, 반복문을 멈추게 해야한다. 
		//만약 start 값이 10일때, 종료하게 하라.
		boolean flag=true;
		while (flag) {
			if(start==10) {
				//실행의 제어권을 반납한다.
				return;
			}
			sum=sum+start;
			System.out.println(" sum("+start+"): "+sum);
			start++;
		}

	}
}
