package basic.ch07;

public class User {

	String id;
	String password;
	String name;
	String gender;
	int age;
	
	// 패스워드 체크 기능 만들어 보기
	// 함수의 이름은 동사로 시작하는 것이 권장 사항이다.
	
	public boolean checkPassword(String inputPwd) {
		// 만약 나의 멤버 변수에 들어가 있는 
		// password 값과 외부에서 넣을 inputPwd값이
		// 같다면 true를 반환, 아니면 false를 반환하라
		
		// == 주소값, 산술식을 사용한다.
		// 문자열 비교는 equals라는 메서드를 사용한다. 
		
		
		if(password.equals(inputPwd)) {
			return true;
		}
		return false;
	}
	
	public boolean logIn(String inputPass) {
		if(password.equals(inputPass)){
			System.out.println("비밀번호가 맞아요.");
			return true;
		}
		System.out.println("비밀번호가 틀렸습니다.");
		return false;
	}
	
	// 독립적인 함수로서 여기서 실행 시킬 수 있다.
	public static void main(String[] args) {
		
		// User 클래스를 인스턴스화 시켜주세요.
		User user1=new User(); // 메모리에 올라간다.(heap)
		user1.password="123";
		
		User user2=new User();
		user2.password="555";
		
		System.out.println("--------------");
		
		//user1의 pwd를 확인 하고 싶다.
		
		boolean user1Result=user1.checkPassword("333");
		System.out.println(user1Result);
		
		boolean user1Result2=user1.checkPassword("123");
		System.out.println("user1의 두번째 결과 : " + user1Result2);
		
		System.out.println("--------------");
		
		// 참조 변수 user2의 기능인 checkPassword 호출해서 결과를 확인해주세요.
		// 첫번째는 false, 두번째는 true를 받게끔 하세요.
		// 실행의 흐름을 만드는 방법 연습.
		// if 구문을 활용해서, 콘솔창에 비밀번호가 틀렸습니다/혹은 비밀번호가 맞습니다를
		//출력하게 하세요.
		
		
		boolean tryLogIn1=user1.logIn("111");
		boolean tryLogIn2=user1.logIn("123");
	}
	
	
	
} // end of class
