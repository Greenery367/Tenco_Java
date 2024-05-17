package basic.ch06;

// 배운 다음...

public class FunctionMainTest2 {
	public static void main(String[] args) {
	    //코드의 시작점
	    System.out.println("여기 메인 함수를 시작합니다.");
	    int result1 = add(5, 10);
	    System.out.println("result1 : " + result1);
	    
	    //성적 합을 구한다.
	    int result2 = add(90,88);
	    System.out.println("result2 : "+result2);
	}//end of main
	
	//지금 다시 코드 수정
	
	static int add (int n1, int n2) { // n1, n2도 지역 변수이다.
		int result; // 변수->지역 변수
		result = n1+n2;
		return result;}
	
}//end of class
