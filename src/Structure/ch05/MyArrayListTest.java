package Structure.ch05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import basic.ch05.Student;

public class MyArrayListTest {
	
	// 메인 쓰레드
	public static void main(String[] args) {
		
		List mList; // 리스트 인터페이스 계열
		
		// ArrayList 클래스의 인스턴스화 처리
		ArrayList list = new ArrayList();
		// 제네릭은 추후 더 설명
		// 제네릭은 타입의 명시화
		ArrayList<Integer> nums = new ArrayList<Integer>();
		// 변수의 선언과 동시에 초기화 ---> 값이 들어가 있는 상태인가?
		// 값을 동시에 추가하고 싶다면...
		ArrayList<Integer> num2 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		
		ArrayList<String> vocabulary = new ArrayList<String>();
		ArrayList<Student> members = new ArrayList();
		
		// 클래스의 정의된 기능을 알아봐야 한다.
		list.add(3); // 리스트에 3 삽입
		list.add(null); // 리스트에 null 삽입
		list.add(1,10); // = 1번째 인덱스에 10을 넣어라.
		// 기존 요소가 있다면 뒤로 자동 이동
		System.out.println("값 추가 확인 : "+list);

		// 참조 변수에는 주소값(4바이트)이 포함된다.
		// 하지만 List의 값을 호출시, 주소값이 아닌 데이터가 호출된다.
		// 이는 toString이 오버라이딩 되어있기 때문.
		
		// 값 삭제
		list.remove(2); // 2번째 인덱스의 값 삭제
		System.out.println("값 삭제 확인 : "+list);
		
		// 전체 삭제
		//list.clear();
		System.out.println("전체 삭제 확인 "+list);
		
		// 리스트 사이즈 확인
		System.out.println(list.size());
		
		// 하나의 요소를 꺼내는 방법
		try {
			System.out.println(list.get(0));
		} catch (Exception e) {
			System.out.println("프로그램이 종료되지 않게 처리");
		}
		
		// ArrayList와 반복문 활용
		nums = list; // 복사 개념 (list는 int형 정수를 받는다.)
		// 복사 개념 필수!!!! 얕은 복사 개념!
		System.out.println(list);
		System.out.println("------------");
		list.add(1000);
		System.out.println(nums);
		
		// for(Integer i : list) {} <-- list는 컴파일 시점에 Object 타입으로 인식
		for(Integer i : nums) {
			System.out.println("i : "+i);
		}
		
		// ArrayList 안에 값이 포함되어 있는가?
		System.out.println("3이 nums 리스트에 존재하는가?"+nums.contains(3));
		System.out.println("500이 nums 리스트에 존재하는가?"+nums.contains(500));
		
		// 요소의 위치(index) 확인
		System.out.println("요소 3이 몇 번째 인덱스에 위치하니? "+nums.indexOf(3));
		System.out.println("요소 10이 몇 번째 인덱스에 위치하니? "+nums.indexOf(10));
		System.out.println("요소 500이 몇 번째 인덱스에 위치하니? "+nums.indexOf(500));
		
		// Iterator 요소 순회(반복자)
		Iterator<Integer> iter = nums.iterator();
		while(iter.hasNext()) {
			System.out.println("while을 활용하는 방법 : "+iter.next());
		}
		
	} // end of main

}
