package useful.ch03;
/**
 * 사용자 정의 예외 클래스 생성
 */
public class PasswordException extends RuntimeException {

	public PasswordException(String message) {
		super(message);
	}
	
}
