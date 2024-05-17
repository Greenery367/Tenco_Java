package basic.ch09;

public class Bus {
	
	int busNumber; // 버스의 번호
	int passengerCount; // 버스의 현재 승객 수
	int money; // 버스의 수익금
	
	// 강제성 부여 - 사용자 정의 생성자
	public Bus(int number) {
		// 객체 생성 시에 제일 먼저 실행되는 부분이다.
		busNumber=number;
	}
	
	// 승객을 태운다.
	public void take(int pay) {
		money+=pay; // 승객이 지불한 요금이 수익에 담긴다.
		passengerCount++; //승객 수에 1명이 추가된다.
	} 
	
	//현재 상황을 보여주는 기능을 만들어보자.(상태창)
	public void showInfo() {
		System.out.println("버스 번호 : " + busNumber);
		System.out.println("버스 승객 수 : " + passengerCount);
		System.out.println("버스 수익금 : " + money);
	}

}  
