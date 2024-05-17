package useful.ch04;

public abstract class Fruit {
	
	void startFruit() {
		System.out.println("과일을 삽니다");
	}
	
	abstract void wash();
	abstract void eat();
	void cleanUp() {
		System.out.println("먹은 자리를 치웁니다.");
	}
	
	final void eatFruit() {
		startFruit();
		wash();
		eat();
		cleanUp();
	}

}
