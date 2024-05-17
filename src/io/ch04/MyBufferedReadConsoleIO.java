package io.ch04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MyBufferedReadConsoleIO {
	
	public static void main(String[] args) {
		
		// 문자 기반 스트림 + 보조 문자 기반 스트림
		
		// 옆으로 확장되는 데코레이터 패턴
		try (InputStreamReader isr = new InputStreamReader(System.in);
				BufferedReader br = new BufferedReader(isr);){
			
			// isr(기반) -> 한 문자씩 읽는 기능인 read() 가지고 있었다.
			// br(보조) -> 한 번에 한 라인씩 읽을 수 있는 기능이 있다.
			System.out.println("더 많은 텍스트를 입력하세요.(한 줄 단위=엔터)");
			// isr.read(); --> 말고 기능의 확장을 활용
			String inputUserData = br.readLine(); 
			System.out.println("입력 확인 : "+inputUserData);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
