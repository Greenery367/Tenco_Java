package basic.ch04;
import java.util.Scanner;
public class OddSumCalculator {
	public static void main(String[] args) {
		//사용자의 입력값을 받아서
		//1부터 x까지의 숫자에 홀수를 덧셈하고 출력하시오.
		
		Scanner sc=new Scanner(System.in);
		System.out.println("정수값을 입력하시오. : ");
		int maxNumber=sc.nextInt();
		
		int sum=0;
		for(int i=2; i<=maxNumber; i+=2) {
			sum=sum+i;
			System.out.println("합은 : "+sum);
		}
		
	}
}
