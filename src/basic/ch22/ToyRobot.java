package basic.ch22;

public class ToyRobot implements RemoteController, SoundEffect{
	
	int width;
	int height;
	String color;
	@Override
	public void turnOn() {
		System.out.println("장난감 로봇을 켭니다.");
		
	}
	@Override
	public void turnOff() {
		System.out.println("장난감 로봇을 끕니다.");
		
	}
	@Override
	public void soundOn() {
		System.out.println("띠리링");
		
	}
	@Override
	public void soundOn2() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void soundOff() {
		System.out.println("갠차나~ 갠차나~딩딩링딩딩~");
		
	}
	@Override
	public void soundOff2() {
		// TODO Auto-generated method stub
		
	}
	
	//turnOn
	//turnOff

}
