package basic.ch14;

public class ArrayTest3 {
	public static void main(String[] args) {
		// 함수의 시작
		//배열의 길이와 요소
		
		char[] alphabet=new char[26];
		char ch1='A';
		alphabet[0]=ch1;
		
		char ch2='B';
		alphabet[1]=ch2;
		
		char ch3='C';
		alphabet[2]=ch3;
		
		char ch26='z';
		alphabet[25]=ch3;
		
		// 배열은 반복문과 함께 많이 사용된다.
		
		int forCount=0;
		int eCount=0;
		
		for(int i=0; i<alphabet.length; i++) {
			if(alphabet[i]!=0) {
				eCount++;
			}
			System.out.println(alphabet[i]);
			forCount++;
		}
		
		System.out.println("for 동작 횟수 :"+forCount);
		System.out.println("배열안의 요소의 개수는? : "+eCount);
		
		
		
	} // end of main

} // end of class
