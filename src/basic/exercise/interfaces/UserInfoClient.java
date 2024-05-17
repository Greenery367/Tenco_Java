package basic.exercise.interfaces;

import basic.ch08.UserInfo;

public class UserInfoClient {
	// main (메인 쓰레드 : 메인 작업자 )
	public static void main(String[] args) {
		
		// 사용자에게 정보를 입력하세요. --> Scanner 활용
		String inputUserName="홍길동";
		String inputUserPw="asd123";
		
		// DTO(=Data Transfer Object): 데이터들을 받아서(취합, 가공) 전달하는 역할을 가지고 있는 인스턴스를 말한다.
		userInfo info1=new userInfo(inputUserName,inputUserPw);
				
		// 데이터를 받아서 iUserInfoDao를 구현한 구현 클래스에게 전달하고자 한다.
		// userInfoDaoMySqlDaoimpl,UserInfoOracleDaoImpl 총 2개의 클래스가 구현 중이다.
		iUserInfoDao iUserInfoDao2=new UserInfoOracleDaoImpl();
		//iUserInfoDao iUserInfoDao2=new UserInfoOracleDaoImpl();
		
		iUserInfoDao2.insertUserInfo(info1);
		iUserInfoDao2.updateUserInfo(info1);
		iUserInfoDao2.deleteUserInfo(info1.getId());
		iUserInfoDao2.selectUserInfo();
		
	} // end of main

} // end of class
