package starcraft.ver02;

public class Zealot {
	private String name;
	private int power;
	private int hp;

	// Zealot 클래스의 사용자 정의 생성자
	public Zealot(String name) {
		this.name = name;
		power = 5;
		hp = 80;
	}

	// 각 변수의 getter 메서드
	public String getName() {
		return name;
	}

	public int getPower() {
		return power;
	}

	public int gerHp() {
		return hp;
	}

	// 질럿이 저글링을 공격합니다.
	public void attack(Zergling z) {
		System.out.println("[" + this.name + "]이 [" + z.getName() + "]을 공격합니다.");
		z.beAttacked(this.power); // 질럿의 공격력을 beAttacked 메서드에 대입
	}

	// 질럿이 마린을 공격합니다.
	public void attack(Marine m) {
		System.out.println("[" + this.name + "]이 [" + m.getName() + "]을 공격합니다.");
		m.beAttacked(this.power);
	}

	// 자신이 공격을 당합니다.
	public void beAttacked(int power) {
		// 방어적 코드 작성
		// 80--75 = 5
		// 5--75 = 0
		if (hp <= 0) {
			System.out.println("[" + this.name + "]은 이미 사망했습니다.");
			hp = 0;
			return;
		}
		hp -= power;
	}
	
	public void showInfo() {
		System.out.println("=====상태창=====");
		System.out.println(" 이름: "+this.name);
		System.out.println(" 공격력: "+this.power);
		System.out.println(" 생명력: "+this.hp);
	}

}
