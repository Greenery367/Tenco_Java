package io.ch01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MyFileInputStream {
	
	public static void main(String[] args) {
		
		// 외부에 있는 파일 데이터를 읽으려면 input이라는 행동 필요
		FileInputStream in = null;
		
		try {
			in = new FileInputStream("a.txt");
			// 1단계
			//int readData = in.read();
			
			// 2단계
			//System.out.print((char)in.read());
			//System.out.print((char)in.read());
			//System.out.print((char)in.read());
			
			// 3단계
			// 읽을 데이터가 더이상 없다면 -1을 반환한다.
			int readData;
			while((readData = in.read())!=-1) {
				System.out.println((char)readData);
			}
			
			// 4단계 FileInputStream(기반 스트림) 대상에 접근해서
			// 한 바이트씩 읽는 기능을 가진다.
			// 1byte: 127~ -128 정수값 : a-->97, A-->65
			// 대-->정수값 얼마일까?
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
