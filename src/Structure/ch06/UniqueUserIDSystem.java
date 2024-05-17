package Structure.ch06;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueUserIDSystem {
	
	private HashSet<String> userIDs;
	
	public UniqueUserIDSystem() {
		this.userIDs = new HashSet<String>();
	}
	
	// 사용자 ID 등록 기능
	// 정상적으로 들어가면 true
	// 중복 발생하면 false
	public boolean registerUserID(String userID) {
		if(userIDs.add(userID)==false) {
			System.out.println("이미 등록된 사용자입니다.");
			System.out.println("------------------");
			return false;
		} else {
			System.out.println("성공적으로 등록되었습니다.");
			System.out.println("------------------");
			return userIDs.add(userID);
		}
	}
	
	// 시스템 실행
	public void run() {
		// 동작 - 스캐너 활용
		// 실행 흐름 만들기 -> while, if
		// 결과 -> 정상 유저 등록
		int count =0;
		while(count<2) {
			System.out.println("------------------");
			System.out.println("로그인을 시작합니다. ID를 입력해주세요 : ");
			
			Scanner scanner = new Scanner(System.in);
			String userID=scanner.next();
			registerUserID(userID);
			count++;
			
		}
		System.out.println(userIDs);
		
	}
	
	private Scanner next() {
		// TODO Auto-generated method stub
		return null;
	}

	// 코드 테스트
	public static void main(String[] args) {
		UniqueUserIDSystem system =new UniqueUserIDSystem();
		system.run();
		
	} // end of main

}
