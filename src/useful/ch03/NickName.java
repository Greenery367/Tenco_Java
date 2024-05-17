package useful.ch03;

public class NickName {
	// 멤버 변수 작성
	private String name;

	// getter
	public String getNick() {
		return this.name;
	}

	// setter
	public void setNick(String n) throws NickNameException {
		if (n == null) {
			throw new NickNameException("null은 닉네임으로 설정할 수 없습니다.");
		}
		if (n.length() < 3) {
			throw new NickNameException("닉네임은 3~7글자까지 입력할 수 있습니다.");
		}
		this.name = name;
	}

}
