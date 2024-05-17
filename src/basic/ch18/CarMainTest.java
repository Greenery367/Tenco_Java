package basic.ch18;

public class CarMainTest {
	public static void main(String[] args) {
		Car car1=new Car();
		car1.startCar();
		
		// 엔진의 속성인 name 변수에 값을 초기화해보자.
		car1.engine.price=11_111_111;
		
		System.out.println(car1.engine.name);
		System.out.println(car1.engine.price);
	}

}
