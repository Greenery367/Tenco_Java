package basic.ch02;

public class RectanglAreaCalculator {
	
	
	public static void main(String[] args) {
	final int RECTANGLE_HORIZON;
	final int RECTANGLE_VERTICAL;
	
	RECTANGLE_HORIZON=35;
	RECTANGLE_VERTICAL=15;
	
	int area=RECTANGLE_HORIZON*RECTANGLE_HORIZON;
	System.out.println("사각형의 면적 : " + area);
	System.out.println(RECTANGLE_HORIZON*RECTANGLE_VERTICAL);
	
	//문자열은 특별한 녀석이다. 연산을 사용할 수 있다.
	//문자열+정수, 문자열+실수...
	//위 연산의 결과값은 문자열로 리턴된다.
	
	}

}
