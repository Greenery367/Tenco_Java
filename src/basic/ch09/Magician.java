package basic.ch09;

public class Magician {
	String name;
	int level;
	int health;
	int power;
	int money;
	int critical;

	public Magician(String A, int a, int b, int c) {
		name = A;
		level = a;
		health = b;
		power = c;
		critical = 0;
	}

	// 상태창
	public void checkMe() {
		System.out.println("---- 상태창 ----");
		System.out.println(" 닉네임: " + name);
		System.out.println(" 레벨: " + level);
		System.out.println(" HP: " + health);
		System.out.println(" MP: " + power);
		System.out.println(" 소지금: " + money);
		System.out.println("------***------");
	}

	public void showInfo() {
		System.out.println(" HP: " + health);
		System.out.println(" MP: " + power);
	}

	// 전사 공격하기
	public void hit(Warrior warrior) {
		power -= 3;
		warrior.health -= 20;
		critical++;
		System.out.println(name + "가 주문을 외웠다!");
		System.out.println(critical + " 콤보!");
		System.out.println(warrior.name + "는 15의 데미지를 입었다.");

	}

	// 마법사 공격하기
	public void hit(Magician magician) {
		power -= 3;
		magician.health -= 15;
		critical++;
		System.out.println(name + "가 주문을 외웠다!");
		System.out.println(critical + " 콤보!");
		System.out.println(magician.name + "는 15의 데미지를 입었다.");

	}

	// 궁수 공격하기
	public void hit(Archer archer) {
		power -= 3;
		archer.health -= 15;
		critical++;
		System.out.println(name + "가 주문을 외웠다!");
		System.out.println(critical + " 콤보!");
		System.out.println(archer.name + "는 15의 데미지를 입었다.");

	}

	// 전사-맞았을 때
	public void attackedWa() {
		health -= 15;
	}

	// 마법사-맞았을 때
	public void attackedMa() {
		health -= 30;
	}

	// 궁수-맞았을 때
	public void attackedAr() {
		health -= 15;
	}

	// 도망치기
	public void run() {
		System.out.println("무서워서 그만 도망쳐 버렸다!");
		System.out.println("가진 돈을 모두 잃었다...");
		critical = 0;
		money = 0;
	}

	// 레벨업
	public void levelUp() {
		if (critical >= 10) {
			level++;
			health += 30;
			power += 30;
			money += 10;
			System.out.println("레벨이 올라갔다!");
			checkMe();
		}
	}
}
