package basic.ch05;

// 클래스란 객체를 만들기 전 설계 도면입니다.
public class Book2 {
	
	public static void main(String[] args) {
		
		//Book 클래스를 인스턴스화 시켜주세요. 
		//2개 참조 타입 변수명은 bookBox1, bookBox2입니다.
		
		Book bookBox1=new Book();
		Book bookBox2=new Book();
		
		//참조 타입의 변수 안에는 실제 값이 들어가는 게 아니라
		//주소 값이 담긴다. (=레퍼런스 변수 Reference Variable)
		bookBox1.author="생텍쥐페리";
		
		System.out.println(bookBox1.author);
		System.out.println(bookBox2);
		
		// Heap 메모리에 생성된 객체에 접근해서
		// 그 해당 객체의 속성값을 넣어 보자.
		
		bookBox1.title="플러터UI 실전";
		bookBox1.author="김근호";
		bookBox1.publishYear=2022;
		bookBox1.totalPage=230;
		
		// 콘솔창에다가 해당 객체의 속성값(상태값)을 출력해보자.
		
		System.out.println(bookBox1.title);
		System.out.println(bookBox1.author);
		System.out.println(bookBox1.publishYear);
		System.out.println(bookBox1.totalPage);
		
		// 연습문제.
		// bookBo2의 클래스 인스턴스화
		
		Book bookBox3=new Book();
		bookBox3.title="아Q정전";
		bookBox3.author="루쉰";
		bookBox3.publishYear=1921;
		bookBox3.totalPage=307;
		
		System.out.println(bookBox3.title);
		System.out.println(bookBox3.author);
		System.out.println(bookBox3.publishYear);
		System.out.println(bookBox3.totalPage);
		
	}
} // end of class
