package starcraft.ver02;

import starcraft.MainTest;

public class Gateway {
	
	private int gatewayNumber;
	private int count;
	
	public Gateway (int gatewayNumber) {
		this.gatewayNumber=gatewayNumber;
		count = 0;
	}
	
	public int getCount() {
		return count;
	}
	
	public int getGatewayNumber() {
		return gatewayNumber;
	}
	
	// 기능 - 질럿을 생산하는 기능을 만들어보자.
	public Zealot createZealot(String name) {
		count++;
		return new Zealot(name);
	}
	
	// 기능 - 저글링을 생산하는 기능을 만들어보자.
	public Zergling creatZergling(String name) {
		count++;
		return new Zergling(name);
	}
	
	
	// 기능 - 마린을 생산하는 기능을 만들어보자.
	public Marine createMarine(String name) {
		count++;
		return new Marine(name);
	}
	

}
