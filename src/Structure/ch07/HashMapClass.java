package Structure.ch07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapClass {

	// 함수의 시작
	public static void main(String[] args) {

		// key, value 구조 한 쌍이다.
		// 업캐스팅 상태
		Map<String, String> books = new HashMap<String, String>();

		// 추가 : 데이터 추가
		books.put("해리포터", "J.K 롤링");
		books.put("반지의 제왕", "J.R.R 톨킨");
		books.put("1984", "조지 오웰");

		// 읽기 : 데이터 읽기
		String author = books.get("해리포터");
		System.out.println("해리 포터 저자 : " + author);
		
		String author2 = books.get("1984");
		System.out.println("1984 저자 : "+ author2);
		
		// 수정 : 데이터 수정
		books.put("1984", "조조입니다.");
		System.out.println(books.get("1984"));
		
		// 삭제 : 데이터 삭제
		books.remove("1984");
		System.out.println(books);
		
		
		// 유용한 기능 확인
		// 1. 자료구조 map에 저장되어 있는 key 값들을 확인하는 방법
		System.out.println("map 자료구조의 key값 확인 "+ books.keySet());
		
		// 반복문 활용
		// map 구조는 순서가 없어서 for -> use index 사용이 불가능하다.
		
		// keySet()은 map의 key를 반환하는 메서드이다.
		for(String key : books.keySet() ) {
			System.out.println("key 값 호출 : "+key);
			System.out.println("key를 통해서 value에 접근 : "+books.get(key));
		}
		
		// 두번째 방법
		// 반복자 활용하는 방법
		System.out.println("--------------------");
		Iterator<Entry<String, String>> iter = books.entrySet().iterator();
		while(iter.hasNext()) {
			// Entry<String, String>
			Entry<String,String> entry =iter.next();
			System.out.println(" 책 : "+entry.getKey()+", "+"저자 : "+entry.getValue());
		}

		System.out.println("--------------------");
		
		// 자료구조에서 제공하는 foreach 구문의 사용
		// 람다 표현식 : 타입 추론, 화살 표기법을 사용한다.
		books.forEach((key,value)->{
			System.out.println("key : "+key);
			System.out.println("value : "+value);
		});
		
		books.clear();
		System.out.println(books.size());
		
	} // end of main

}
