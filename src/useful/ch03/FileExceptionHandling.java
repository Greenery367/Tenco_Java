package useful.ch03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {
	
	// 메인 스레드
	public static void main(String[] args) {
		
		FileInputStream fis=null;
		
		try {
			fis=new FileInputStream("demo.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Catch 구문 실행!");
			e.printStackTrace();
		} finally {
			// 반드시 수행 되어야 하는 코드 영역
			// 심지어 return 키워드를 만나더라도 여기는 수행이 된다.
			// -> return보다 finally가 더 세다!!
			System.out.println("finally 블록 수행");
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //닫은 시점에 fis. <--객체가 생성 안 되었을 수도 있음.
		}
		
		
		System.out.println("비정상 종료되지 않았어요!");
		
	} // end of main

} // end of class
