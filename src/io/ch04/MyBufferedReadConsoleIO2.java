package io.ch04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MyBufferedReadConsoleIO2 {
	
	public static void main(String[] args) {
		
		// 데이터를 통으로 관리하고 싶다면 --> 자료구조 --> 적절한 자료구조 선택
		
		List<String> lines = new ArrayList<String>();
		
			try (InputStreamReader isr = new InputStreamReader(System.in);
					BufferedReader br = new BufferedReader(isr);){
				
					String line;
					// "" --> 엔터 --> null/isEmpty -->f --> 실행 종료
					while((line=br.readLine())!=null && line.isEmpty()) {
						lines.add(line); // 한 줄의 데이터를 자료구조에 저장
						//System.out.println("입력 확인 : "+line);
					}
					
					for (String data : lines) {
						System.out.println(data);
					}
					
					System.out.println("프로그램 종료 처리");
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		
		
		
	}

}
