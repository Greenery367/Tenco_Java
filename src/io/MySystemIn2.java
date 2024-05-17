package io;

import java.io.IOException;

public class MySystemIn2 {
	
	public static void main(String[] args) {
		
		// 키보드에서 데이터를 응용 프로그램 안으로 넣기
		System.out.println("알파벳 하나를 쓰고, Enter를 누르세요");
		
		// 바이트 동작 -> 0과 1로 구성
		// 정수 -> byte, short, int, long
		
		int i;
		// 한 바이트씩 키보드에 값을 읽어라
		
		try {
			// while의 괄호 내에는 수식 사용 가능
			while((i=System.in.read())!='\n') {
				System.out.println(" i : "+i);
				System.out.println(" (char)i :"+(char)i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
