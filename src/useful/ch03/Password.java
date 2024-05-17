package useful.ch03;

public class Password {

	private String pwd;

	// getter
	public String getPwd() {
		return this.pwd;
	}

	// setter
	public void setPwd(String pwd) throws PasswordException {
		if (pwd == null) {
			throw new PasswordException("비밀번호는 null값일 수 없습니다.");
		}
		if (pwd.length() < 5) {
			throw new PasswordException("비밀번호는 5자리 이상이어야 합니다.");
		}
		// 정규 표현식을 활용할 수 있다.
		// pwd<== a~z, A~Z ==> true
		// pwd<== a,10,! ==> false
		if (pwd.matches("[a-zA-Z]+")) {
			throw new PasswordException("비밀번호는 숫자나 특수 문자를 포함해야 합니다.");
		}
		this.pwd = pwd;
	}

}
