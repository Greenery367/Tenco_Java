package basic.ch18;

public class Computer {
	String name;
	int price;
	CPU cpu;
	
	public Computer() {
		cpu = new CPU();
	}
	
	public void StartComputer() {
		System.out.println("컴퓨터의 전원을 켭니다.");
		this.cpu.start();
	}
	public void StopComputer() {
		System.out.println("컴퓨터의 전원을 끕니다.");
		this.cpu.stop();
	}
	
	public static void main(String[] args) {
		Computer pc1=new Computer();
		pc1.StartComputer();
		pc1.StopComputer();
		pc1.cpu.name="오늘 산 CPU";
		System.out.println(pc1.cpu.name);
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public CPU getCpu() {
		return cpu;
	}

	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}

}
