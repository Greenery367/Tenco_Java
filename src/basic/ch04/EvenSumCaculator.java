package basic.ch04;
import java.util.Scanner;
public class EvenSumCaculator {
	
	public static void main(String[] args) {
		
		//ctrl+shift+o: import
		Scanner sc=new Scanner(System.in);
		System.out.print("정수값을 입력하세요.");
		int maxNumber=sc.nextInt();
		//1<고정값 10->2,4,6,8

		
		int sum=0;
		//반복적인 패턴이 확인된다. 
		//1부터 10까지 10번 반복된다. (1,2,3,4,5,6,7,8,9,10)
		for(int i = 2; i <= maxNumber; i = i += 2) { //복합대입연산자를 사용하면 더 간단해진다.
			sum = sum + i;
			
		}
		System.out.println("sum : "+sum);
		
	}//end of main
}//end of class
