package basic.ch22;

public class Television extends HomeApplience implements RemoteController{

	@Override
	public void turnOn() {
		System.out.println("티비를 켠다.");
	}

	@Override
	public void turnOff() {
		System.out.println("티비를 끈다.");
	}

}
