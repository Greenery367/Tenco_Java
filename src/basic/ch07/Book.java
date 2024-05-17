package basic.ch07;

public class Book {
	String title;
	String author;
	int price;
	int page;
	String genre;
	String store;
	
	// 남은 페이지 알려주기
	public void bookMark(int pageNum) {
		System.out.println("현재 남은 페이지 수는 " + (page-pageNum) + "장 입니다.");
	}
	
	// 제목 알려주기
	public void printTitle() {
		System.out.println("이 책의 제목은 " + title + "입니다.");
	}
	
	// 저자 알려주기
	public void printAuthor() {
		System.out.println("이 책의 저자는 " + author + "입니다.");
	}
	
	// 장르 알려주기
	public void printGenre() {
		System.out.println("이 책의 장르는 " + genre + "입니다.");
	}
	
	// 구매경로 알려주기
	public void printbuy() {
		System.out.println("이 책은 " + store + "에서 구매할 수 있습니다.");
	}

} // end of class
