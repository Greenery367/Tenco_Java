package basic.ch08;

public class UserInfo {
	
	public String userId;
	public String userPassword;
	public String userName;
	public String userAddress;
	public int phoneNumber;
	
	// 생성자 오버로딩이란
	// 생성자의 개수가 여러개 있다
	
	// 기본 생성자 형태 만들어 보기
	
	public UserInfo() {} // 기본 생성자
	
	public UserInfo(String inputUserId) {
		userId = inputUserId;
	}
	
	public UserInfo(String id, String name) {
		userId=id;
		userName=name;
	}
	
	// 연습 문제-
	// 1. 매개 변수 3개를 받는 생성자를 만들어 주세요.
	// 2. 매개 변수 4개를 받는 생성자를 만들어 주세요.
	// 3. 매개 변수 5개를 받는 생성자를 만들어 주세요.
	
	public UserInfo(String id, String password, String name){
		userId=id;
		userPassword=password;
		userName=name;}
	
	public UserInfo(String id, String add, String name, int num) {
		userId=id;
		userAddress=add;
		userName=name;
		phoneNumber=num;
	}
	
	public UserInfo(String id, String pass, String name, String add, int ph) {
		userId=id;
		userPassword=pass;
		userName=name;
		userAddress=add;
		phoneNumber=ph;
	}

} // end of class
