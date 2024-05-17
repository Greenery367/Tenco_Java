package useful.ch04;

public class Peach extends Fruit {

	@Override
	void wash() {
		System.out.println("복숭아를 씻습니다.");
		System.out.println("깨끗하게 씻은 복숭아를 깎습니다.");
	}

	@Override
	void eat() {
		System.out.println("잘 자른 복숭아를 먹습니다.");
		
	}
	
	public static void main(String[] args) {
		Peach peach = new Peach();
		peach.eatFruit();
	}

}
