package basic.ch18;

public class CPU {
	String name;
	int price;
	
	void start() {
		System.out.println("CPU가 작동합니다.");
	}
	void stop() {
		System.out.println("CPU가 작동을 멈춥니다.");
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}

}
