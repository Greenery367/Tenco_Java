package basic.ch15;

public class BookTest {
	public static void main(String[] args) {
		// 함수의 시작
		// 배열이란 연관된 데이터를 하나의 변수에 통으로 관리하고 싶다면 - 자료구조
		// 배열을 사용할 때 반드시 크기가 지정되어야 한다.
		Book[] books=new Book[10]; //참조 타입 배열 만들기
		// ㄴBook 이라는 데이터 타입을 담는 배열이 올라간 것이다.
		// 배열에 메모리 공간을 선언했다.(객체 x)
		
		books[0]=new Book("플러터 UI 실전", "김근호");
		books[1]=new Book("무궁화 꽃이 피었습니다", "김진명");
		books[2]=new Book("옥문도", "요코미조 세이시");
		books[3]=new Book("리딩으로 리드하라", "이지성");
		books[4]=new Book("팔묘촌", "요코미조 세이시");
		books[9]=new Book("삼수탑", "요코미조 세이시");
		

		for(int i=0; i<books.length; i++) {
			if(books[i]!=null) {
				System.out.println(books[i].getTitle());
				System.out.println(books[i].getAuthor());
				System.out.println("----------------");	
			}
		}
		
		
	} // end of main
	
} // end of class
