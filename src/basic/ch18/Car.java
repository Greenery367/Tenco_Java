package basic.ch18;

public class Car {
	String name;
	int price;
	Engine engine; // has-a 관계
	
	public Car() {
		// 포함관계(Composition)
		// 객체 안에 필요한 객체를 직접 생성할 경우
		// 그 때를 Composition 관계라고 한다.
		engine = new Engine();
		// Car라는 객체가 생성될 때, 엔진 객체도 함께 생성된다.
	}
	
	public void startCar() {
		engine.start();
		System.out.println("자동차가 출발합니다.");
	}
	
	public void stopCar() {
		engine.stop();
		System.out.println("자동차가 멈춥니다.");
	}

}
