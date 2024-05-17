package basic.ch22;

public class AnimalTest {
	public static void main(String[] args) {
		Animal d1=new Dog(); // 인터페이스는 기본적으로 new 할 수 없다.
		Animal b1=new Bird(); // 다형성의 개념, 업캐스팅 
		
		d1.eat();
		d1.move();
		b1.eat();
		b1.move();
	}

}
