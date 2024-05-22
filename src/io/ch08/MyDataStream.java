package io.ch08;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MyDataStream {
	
	
	public static void main(String[] args) {
		
		// 데이터 쓰기 - byte, 문자 기반이 아닌 원시 기본 자료형 데이터 타입으로 보내기
		// 파일에 사용 -- FileOutputStream ("대상 파일명") <-- 확장(보조 스트림)
		try (
				DataOutputStream dos = new DataOutputStream(new FileOutputStream("student.txt"))){
			dos.writeInt(101); // 학번
			dos.writeUTF("홍길동"); // 이름
			dos.writeDouble(3.5);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(">>> data 쓰기 완료 (원시타입) <<<");
		
		
		// 기본 데이터 타입으로 데이터 읽기
		try (DataInputStream dis = new DataInputStream((new FileInputStream("student.txt")))){
			int id=dis.readInt();
			String name = dis.readUTF();
			double score = dis.readDouble();
			
			System.out.println("학번 : "+id);
			System.out.println("이름 : "+name);
			System.out.println("학점 : "+score);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(">>> data 읽기 완료 (기본 데이터 타입) <<<");
	} // end of main

}
