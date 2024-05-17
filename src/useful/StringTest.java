package useful;

public class StringTest {
	public static void main(String[] args) {
		
		String str1=new String("abc");
		String str2=new String("abc");
		
		System.out.println(str1==str2);
		
		String str3="abc";
		String str4="abc"; // 불변
		
		// 상수 풀에 올라간 String 값은
		// 먼저 존재하는지 확인부터 하게 된다.
		// 만약 같은 문자열이 존재한다면,
		// 새로 생성하지 않고, 다시 재사용한다.
		
		System.out.println(str3==str4);
		System.out.println(str1==str4);
		
		
		
	} // end of main

} // end of class
