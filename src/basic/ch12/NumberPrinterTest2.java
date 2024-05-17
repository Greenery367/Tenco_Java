package basic.ch12;

public class NumberPrinterTest2 {
	public static void main(String[] args) {
		 
		// 객체 각각에 존재하는 멤버 변수를 사용하려면
		// 메모리에 올라가야 사용할 수 있다. 
		// static 변수는 클래스 변수라고도 불린다.
		
		System.out.println(NumberPrinter.waitNumber);
		// static 변수는 클래스 이름.으로 접근할 수 있다.
		// 클래스 이름으로 접근할 수 있기 때문에-> 클래스 변수라고 불린다.
		
		
	} // end of main

} // end of class
