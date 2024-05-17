package basic.exercise.interfaces;

// DTO 개념으로 바라볼 수 있다.
public class userInfo {
	public static int SERIAL_NUM = 0;
	private int id; // 식별자 == 1, 2, 3
	private String userName;
	private String pw;
	
	public userInfo (String userName, String pw) {
		this.userName=userName;
		this.pw=pw;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return this.userName;
	}
	
	public String getPw() {
		return this.pw;
	}
	
	public String toString() {
		return id+", "+userName+", "+pw;
	}
}
