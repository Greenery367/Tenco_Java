package io.ch04;

import java.io.InputStreamReader;

public class SingleCharRead {
	
	public static void main(String[] args) {
		
		// 문자 기반의 InputStreamReader 사용 방법
		// ** 중요 **
		// InpustStreamReader는 한 바이트씩 데이터를 읽는 것이 아니라,
		// 하나의 문자 단위로 읽습니다!!
		
		System.out.println("문자 하나를 입력 하세요");
		
		// try-catch resource 문법
		try(InputStreamReader isr = new InputStreamReader(System.in)){
			
			// 한 <-- 통으로 읽음 --> InputStreamReader
			// 한 <-- 한 바이트로는 못 읽음 --> InputStreamReader
			int charData=isr.read();// 사용자가 키보드에 값을 입력할 때까지 대기
			if(charData != -1) {
				// -1 --> 파일의 끝을 나타냄(EoF)
				// char --> 2 byte 크기 (한글을 포함해 거의 모든 글자 표현이 가능하다.)
				System.out.println("사용자가 입력한 값 : "+(char)charData);
			}
		} catch (Exception e) {
			System.out.println("뭔가 잘못 되었습니다.");
			e.printStackTrace();
		}
		
	}

}
