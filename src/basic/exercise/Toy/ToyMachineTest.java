package basic.exercise.Toy;

public class ToyMachineTest {
	public static void main(String[] args) {
		Product rabitDoll = new Doll("토끼 인형"); // 0
		Product lionDoll = new Doll("사자 인형"); // 1
		Product BearDoll = new Doll("곰 인형"); // 2
		Product iPhone = new Gadget("아이폰"); // 3
		Product iPot = new Gadget("아이팟"); // 4

		System.out.println("------------");

		ToyMachine newMachine = new ToyMachine(); //newMachine 생성
		newMachine.addProduct(rabitDoll); // 0
		newMachine.addProduct(lionDoll); // 1
		newMachine.addProduct(BearDoll); // 2
		newMachine.addProduct(iPhone); // 3
		newMachine.addProduct(iPot); // 4

		newMachine.start();
		System.out.println("------------");
		((Doll)newMachine.getProducts()[0]).check(); // product[0]을 Doll로 다운 캐스팅
		((Doll)newMachine.getProducts()[1]).check(); //product[1]을 Doll로 다운 캐스팅
		((Gadget)newMachine.getProducts()[3]).check(); //product[2]를 Gadget으로 다운 캐스팅
		
		newMachine.showInfo();
	}

}
