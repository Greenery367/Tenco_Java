package useful.ch07;

import useful.ch07.Spaceship.Engine;

public class SpaceshopTest {
	public static void main(String[] args) {
		
		Spaceship spaceship = new Spaceship();
		spaceship.startSpaceShip();
		
		// 외부에서 엔진을 만들어서
		// spaceship 주입시켜야 한다.
		
		Engine 누리호1번엔진 = new Engine();
		Engine 누리호2번엔진 = new Spaceship.Engine();
		Engine 누리호3번엔진 = new Spaceship.Engine();
		// 변수명은 한글로 작성하지 말자 !!
		
		System.out.println("----------");
		spaceship.addEngine(누리호3번엔진);
		spaceship.startSpaceShip();
		
		// 사용하는 이유
		// 논리적인 그룹화
		// 정적 내부 클래스는 외부 클래스와 논리적을
		// 관련있는 클래스들을 그룹화하는 데 유용하다.
	}

}
