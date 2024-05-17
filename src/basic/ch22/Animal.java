package basic.ch22;

interface Animal {
	// 인터페이스에는 추상 메서드만 선언할 수 있다.
	
	//public abstract void eat();
	//public abstract void move();
	
	// 축약 가능
	void eat();
	void move();

}

class Dog implements Animal {

	@Override
	public void eat() {
		System.out.println("먹이를 먹다.");
		
	}

	@Override
	public void move() {
		System.out.println("촐랑촐랑 다닌다.");	
	}
	
	
}


class Bird implements Animal{

	@Override
	public void eat() {
		System.out.println("모이를 먹는다.");
		
	}

	@Override
	public void move() {
		System.out.println("날아간다");
		
	}
	
}