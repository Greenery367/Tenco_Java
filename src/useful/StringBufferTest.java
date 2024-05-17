package useful;

public class StringBufferTest {


	// 코드의 시작점 - (메인 작업자)
	public static void main(String[] args) {

		String str1 = "Hello";
		String str2 = new String("World!");
		// 힙 메모리에 객체 2개 생성

		StringBuffer bufferStr = new StringBuffer("Hello");
		System.out.println(bufferStr);
		System.out.println(System.identityHashCode(bufferStr));

		bufferStr.append(str2);

		System.out.println(bufferStr);
		System.out.println(System.identityHashCode(bufferStr));

		// 1번 결과와 2번 결과에 주소값이 같다라는 의미는
		// 새로운 메모리를 할당한 것이 아닌 변경한 것이다.
		
		String newStr=bufferStr.toString();
		System.out.println(bufferStr);
		

	} // end of main



} // end of class
