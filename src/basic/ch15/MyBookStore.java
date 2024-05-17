package basic.ch15;

/**
 * author - 엄송현
 * 모든 프로그래밍의 기본은 C R U D 이다.
 */


import java.util.Scanner;

public class MyBookStore {
	static int LAST_INDEX_NUMBER=0;
	public static void main(String[] args) {
	
		// 준비물
		Scanner sc = new Scanner(System.in);
		// 배열 선언
		Book[] books = new Book[100];

		// 샘플 데이터 생성
		books[0] = new Book("플러터 UI 실전", "김근호");
		books[1] = new Book("무궁화 꽃이 피었습니다", "김진명");
		books[2] = new Book("옥문도", "요코미조 세이시");
		books[3] = new Book("리딩으로 리드하라", "이지성");
		books[4] = new Book("팔묘촌", "요코미조 세이시");

		// 메뉴 생성-상수 선언
		final String SAVE = "1";
		final String SEARCH_ALL = "2";
		final String SEARCH_BY_TITLE = "3";
		final String DELETE_ALL = "4";
		final String END = "0";
		boolean flag = true;

		while (flag) {
			System.out.println("** 메뉴 선택 **");
			System.out.println("1. 저장 | 2. 전체 조회 | 3. 선택 조회 | 4. 전체 삭제 | 0. 프로그램 종료");
			String selectedNumber = sc.nextLine(); // 문자열을 받고+줄을 바꿔주는 메서드

			System.out.println("selectedNumber :" + selectedNumber);

			if (selectedNumber.equals(SAVE)) { // String 비교할 땐 equals
				System.out.println(">> 저장하기 <<");
				save(sc,books);
				
			} else if (selectedNumber.equals(SEARCH_ALL)) {
				System.out.println(">> 전체 조회하기 <<");
				readAll(books);
				
			} else if (selectedNumber.equals(SEARCH_BY_TITLE)) {
				System.out.println(">> 선택 조회하기 <<");
				readByTitle(sc,books);
				
			} else if (selectedNumber.equals(DELETE_ALL)) {
				System.out.println(">> 전체 삭제하기 <<");
				deleteAll(books);
				
			} else if (selectedNumber.equals(END)) {
				System.out.println(">> 프로그램 종료하기 <<");
				flag = false;
				
			} else {
				System.out.println(">> 잘못된 선택입니다. <<");
			}

		}

	} // end of main

	// 1. 저장하기
	public static void save(Scanner sc, Book[] books) {
		// 배열에 저장하려면, book[3]=new Books();
		System.out.println("-----저장하기-----");
		System.out.println("책의 제목을 입력하세요.");
		String bookTitle = sc.nextLine();
		System.out.println("책의 저자를 입력하세요.");
		String bookAuthor = sc.nextLine();
		Book book=new Book(bookTitle, bookAuthor);
		if(LAST_INDEX_NUMBER>=books.length) {
			System.out.println("더 이상 저장할 공간이 없습니다.");
			return;
		}
		for(int i=0; i<books.length; i++) {
			if(books[i]==null) {
				books[i]=book;
				LAST_INDEX_NUMBER++;
				break;
			}
		}
		System.out.println(">> 저장이 완료되었습니다. <<");
	}

	
	
	// 함수를 활용해보자.
	// 2. 전체 조회하기
	public static void readAll(Book[] books) { // 모든 책을 보고 싶음->배열 활용
		System.out.println("-----전체 조회하기-----");
		if (books.length <= 0) {
			System.out.println("책이 하나도 없습니다.");
		}
		for (int i = 0; i < books.length; i++) {
			// 방어적 코드
			if (books[i] != null) {
				System.out.println(books[i].getTitle() + "," + books[i].getAuthor());
			}
		}
	}

	// 3. 선택 조회하기
	public static void readByTitle(Scanner sc, Book[] books) {
		System.out.println("-----선택 조회하기-----");
		System.out.println("책 제목을 입력해주세요.");
		String bookTitle=sc.nextLine();
		Boolean isFind=false;
		// 사용자가 입력한 책 제목
		// books 전부 조사 books[0]-->객체 가리킴-->객체.getTitle()
		// 문자열 비교-->equals(bookTitle)
		//books[0].getTitle().equals()
		// ㄴ만약 배열 안에 객체가 없다면, null pointer exception이 발생할 수 있다.
		
		// 만약 사용자가 입력한 책 제목과 배열 요소 안에 title 값이 같다면
		// 화면에 책 제목, 책 저자 이름을 출력하고
		// 아니라면, 해당하는 책이 없습니다. 라는 문구를 출력하시오.
		for(int i=0; i<books.length; i++) {
			if(books[i]!=null) {
				if(books[i].getTitle().equals(bookTitle)) {
					System.out.println(" 책 제목 "+books[i].getTitle());
					System.out.println(" 책 저자 "+books[i].getAuthor());
					isFind=true;
					break;
				}
			}
		}
		if(isFind==false) {
			System.out.println("해당 제목의 책은 존재하지 않습니다.");
		}
	}
	
	
	
	// 4. 전체 삭제 메서드
	public static void deleteAll(Book[] books) {
		System.out.println("-----전체 삭제하기-----");
		for (int i = 0; i < books.length; i++) {
			books[i] = null;
			// 오브젝트 타입은 null을 넣어주면 삭제된다.
		}

	}

} // end of class
