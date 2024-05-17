package useful;
/**
 * Object 클래스는 모든 클래스의 최상위 클래스이다.
 * import java.lang*; 프로그래밍시 import 하지 않아도 자동으로 가지고 온다.
 * 자바는 단일 상속만 지원합니다.
 * 단, Object 클래스를 제외합니다.
 */
public class Book extends Object{
	
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title=title;
		this.author=author;
	}
	
	// Object 클래스 ->toString();
	
	@Override
	public String toString() {
		return "[ "+title+" ] , [ "+author+" ]";
	}
	
	public static void main(String[] args) {
		Book book=new Book("데미안","헤르만 헤세");
		System.out.println(book.toString());
		
		String str1=new String("안녕");
		System.out.println(str1);
	}

}
