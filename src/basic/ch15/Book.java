package basic.ch15;

public class Book {
	private int totalPage;
	private String title;
	private String author;
	
	// 생성자 
	public Book(String title, String author) {
		this.title=title;
		this.author=author;
	}
	
	// 생성자 오버로딩
	public Book(String title, String author, int totalpPage) {
		this(title, author);
		this.totalPage=totalPage;
	}
	
	// getter 메서드
	public int getPage() {
		return this.totalPage;
	}
	public String getTitle() {
		return this.title;
	}
	public String getAuthor() {
		return this.author;
	}
	
	// setter 메서드
	public void setPage(int page) {
		this.totalPage=page;
	}
	public void setTitle(String title) {
		this.title=title;
	}
	public void setAuthor(String author) {
		this.author=author;
	}
	
	// showInfo 메서드
	public void showInfo() {
		System.out.println(">>>책 정보<<<");
		System.out.println("제목 : "+title);
		System.out.println("저자 : "+author);
		System.out.println("총 페이지 수 : "+totalPage);
	}
	
}
