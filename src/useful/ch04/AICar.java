package useful.ch04;

public class AICar extends Car {

	@Override
	void drive() {
		System.out.println("AI 자동차가 자율 주행을 합니다.");
		System.out.println("스스로 방향을 바꿉니다.");
		
	}

	@Override
	void stop() {
		System.out.println("AI 자동차가 자동으로 차를 멈춥니다.");
		System.out.println("위험을 감지해서 급하게 제동합니다.");
	}

}
