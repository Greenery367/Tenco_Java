package io.ch07;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipFileHelper {
	
	// 파일을 압축하는 기능 - zip
	
	public static void zipFile(String fileToZip, String zipFileName) {
		
		// ZipOutputStream 을 사용해서, ZiP 형식으로 데이터를 압축할 수 있다.
		// FileOutputStream 을 활용해서 설정
		
		try (// 기반 스트림
				FileInputStream fis = new FileInputStream(fileToZip);
				// 보조 스트림 - 압축하는 기능
				ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(zipFileName));){
			// ZipEntry 객체 생성 - 압축 파일 내에서 개별 파일을 나타냅니다.
			ZipEntry zipEntry = new ZipEntry(fileToZip);
			zos.putNextEntry(zipEntry);
			
			// 파일 내용을 읽고 ZIP 파일에 쓰기 위한 버퍼 생성
			byte[] bytes = new byte[1024];
			int length;
			
			while((length = fis.read(bytes))>=0) {
				zos.write(bytes,0,length);
			}
			
			zos.closeEntry();
			System.out.println("ZIP 파일 생성 완료 : "+zipFileName);
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("ZIP 파일 생성 시 오류 발생");
		}
		
	}
	
	public static void main(String[] args) {
		
		ZipFileHelper.zipFile("seoul.txt", "zipSeoul.zip");
		
	} // end of main

} // end of class
