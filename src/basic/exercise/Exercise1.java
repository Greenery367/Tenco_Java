package basic.exercise;

public class Exercise1 {
	
	public static void main(String[] args) {
		
		// 1. 데이터 10,100,100의 변수를 이름을 정해 선언하고, 화면에 출력해라.
		int aa=10;
		int bb=100;
		int cc=100;
		System.out.println(aa);
		System.out.println(bb);
		System.out.println(cc);
		
		// 2.int ageBox에 20을 담기
		int ageBox;
		ageBox=20;
		
		// 2-1. ageBox의 값을 30으로 변경하고,
		//기존의 데이터를 다른 곳으로 옮기기
		int oldBox=ageBox; //oldBox 변수에 ageBox의 값을 미리 옮겨둔다.
		ageBox=30; //ageBox의 값을 30으로 변경한다.
		System.out.println("oldBox:"+oldBox);
		System.out.println("ageBox:"+ageBox);
		//값이 사라지지 않게 하기 위해서는 메모리 상자를 하나 더 만들어서,
		//넣어두면 된다.
		
		
		// 3. int a=1; int b=3;
		//위를 선언하고 a와 b에 담겨 있는 값을 서로 스위칭한다.
		int a=1;
		int b=3;
		
		int temp=a;
		int tamp=b;
		
		a=tamp;
		b=temp;
		
		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}//end of main

}//end of class
