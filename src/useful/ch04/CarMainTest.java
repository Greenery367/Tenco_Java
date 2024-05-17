package useful.ch04;

public class CarMainTest {
	
	public static void main(String[] args) {
		
		Car aicar = new AICar(); // 다형성, 업캐스팅된 상태
		// 프로그램을 실행시키기 위해서 run() 메서드를 호출해야 한다-약속
		aicar.run();
		
		Car manualCar = new ManualCar();
		manualCar.run();
		
	} // end of main

} // end of class
