package basic.ch07;

public class Book2 {
	public static void main(String[] args) {
	// 코드의 시작점
		
		Book book1 = new Book();
		Book book2 = new Book();
		Book book3 = new Book();
		
		
		book1.title = "해리 포터와 마법사의 돌";
		book1.author = "조앤 롤링";
		book1.price = 27000;
		book1.page=300;
		book1.genre = "판타지";
		book1.store = "영광도서";
		
		book2.title = "커리어 스킬";
		book2.author = "존 손메즈";
		book2.price = 25200;
		book2.page=352;
		book2.genre = "자기계발";
		book2.store = "남포문고";
		
		book3.title = "플러터 앱 프로그래밍";
		book3.author = "김근호";
		book3.price = 19800;
		book3.page=170;
		book3.genre = "IT기술";
		book3.store = "교보문고";
		
		
		book1.bookMark(120);
		book1.printAuthor();
		book3.printTitle();
		book2.printGenre();
		book2.printbuy();
		
	} // end of main

} // end of class
