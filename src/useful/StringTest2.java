package useful;

public class StringTest2 {
	public static void main(String[] args) {

		String str3 = "abc";
		String str4 = "abc";
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		
		str3 = str3 + " : def ";
		System.out.println(System.identityHashCode(str3));
		// 리터럴 타입으로 생성한 String은 한 번 생성하면 불변이다.
		
		

	} // end of main

} // end of class
