package useful.ch04;

public abstract class Car {
	
	void startCar() {
		System.out.println("시동을 켭니다.");
	}
	abstract void drive();
	abstract void stop();
	void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	// 템플릿 메서드 패턴의 핵심!
	// 메서드 앞에 final 키워드를 사용한다면, 하위 클래스에서 재정의 할 수 없다.
	final void run() {
		// 실행의 흐름 만들어 보기
		startCar();
		drive();
		stop();
		turnOff();
	}

}
