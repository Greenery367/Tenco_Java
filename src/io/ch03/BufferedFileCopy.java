package io.ch03;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedFileCopy {
	
	public static void main(String[] args) {
		// 기반 스트림 + 보조 스트림을 활용해서 파일 복사 기능을 만들고
		// 소요 시간을 측정하시오
		String a="D:\\Workspace_ESH\\tenco_java_class\\a.txt";
		String b="D:\\Workspace_ESH\\tenco_java_class\\demo.txt";
		
		long startTime = System.nanoTime();
		
		try {
			FileInputStream a1=new FileInputStream(b);
			FileOutputStream b2=new FileOutputStream(a);
			
			int data;
			while((data=a1.read())!=-1) {
				b2.write(data);
			}
			System.out.println("입력!");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		long endTime =System.nanoTime();
		long duration=endTime=startTime;
		
		double seconds=duration/1_000_000_000.0;
		String resultFormat = String.format("소요 시간: %.6f초", seconds);
		System.out.println(resultFormat);
	}

}
