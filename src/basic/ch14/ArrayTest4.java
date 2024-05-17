package basic.ch14;

public class ArrayTest4 {
	public static void main(String[] args) {
		String[] arrayStr=new String[26];
		
		arrayStr[0]="A";
		arrayStr[1]="B";
		arrayStr[2]="C";
		arrayStr[3]="D";
		arrayStr[3]="E";
		
		// 배열 안의 요소의 개수를 출력하시오.
		// 값이 있다면 콘솔창에 출력하시오.
		// 반복문 활용
	
		int zeroCount=0;
		int allCount=0;
		
		for(int i=0; i<arrayStr.length; i++) {
			allCount++;
			if(arrayStr[i]==null) {
				zeroCount++;
			}
			else {
				System.out.println(i+"번째 요소의 값은 "+arrayStr[i]+"입니다.");
			}
		}
		
		System.out.println("배열의 총 요소의 개수는 "+allCount+"개 입니다.");
		System.out.println("실제 요소의 개수는 "+(allCount-zeroCount)+"개 입니다.");
		System.out.println("빈 요소의 개수는"+zeroCount+"개 입니다.");
		
		
		
		int eCount=0;
		for(int i=0; i<arrayStr.length; i++) {
			if(arrayStr[i]!=null) {
				eCount++;
				System.out.println(arrayStr[i]);
			}
		}
		System.out.println("요소의 개수 : "+eCount);
		
		
	} // end of main

} // end of class
