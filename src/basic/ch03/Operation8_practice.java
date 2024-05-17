package basic.ch03;
import java.util.Scanner;
public class Operation8_practice {
	
	public static void main(String[] args) {
		
		System.out.println("두 사람 중 누구의 키가 더 큰지 출력하세요");
		
		Scanner sc=new Scanner(System.in);
		int minji=sc.nextInt();
		System.out.println("민지의 키는:"+minji);
		int jisoo=sc.nextInt();
		System.out.println("지수의 키는"+jisoo);
		
		System.out.println("-------");
		
		int max=minji>jisoo ? minji : jisoo;
	}
}
