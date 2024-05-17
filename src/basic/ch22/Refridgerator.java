package basic.ch22;

public class Refridgerator extends HomeApplience 
implements RemoteController, SoundEffect{

	@Override
	public void turnOn() {
		System.out.println("냉장고를 켠다.");
	}

	@Override
	public void turnOff() {
		System.out.println("냉장고를 끈다.");
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
		// TODO Auto-generated method stub
		System.out.println("띠로리");
	}

	@Override
	public void soundOff2() {
		// TODO Auto-generated method stub
		
	}

}
