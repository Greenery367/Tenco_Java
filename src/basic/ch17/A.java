package basic.ch17;
// 상상력 추가
// 선임이 작성한 코드라고 가정한다.
public class A {
	String name;
	int height;
	int weight;
	int age;
	// 위의 코드와 비슷한 기능의 코드를 구현해달라고 부탁받았다.
	// 바로 수정하게 된다면, 어떤 문제가 생길 수 있다.
}


// 복사+붙여넣기도 가능하다.
// 단, 하나의 자바 파일 안에, 여러 개의 클래스를 작성할 수 있다.
// 단, public이 붙은 클래스는 오직 하나만 정의 가능하다.
class B {
	
	String name;
	int height;
	int weight;
	int age;
	
	int level;
	String nickName;
}

class C extends A {
	
	int level;
	String nickName;
	String phone;
}