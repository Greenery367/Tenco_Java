package basic.ch18;

public class ComputerTest {
	public static void main(String[] args) {
		Computer computer = new Computer();

		CPU cpu1 = new CPU();
		cpu1.setName("AMD");
		computer.setCpu(cpu1);

		System.out.println(computer.getCpu().getName());

	}

}
