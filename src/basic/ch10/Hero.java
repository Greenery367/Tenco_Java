package basic.ch10;

public class Hero {
	private String name;
	private int hp;
	private int power;
	private double defense;
	private boolean isDie;

	// getter 메서드
	public String getName() {
		return this.name;
	}

	public int getHp() {
		return this.hp;
	}

	public int getPower() {
		return this.power;
	}

	public double getDefense() {
		return this.defense;
	}

	// setter 메서드
	public void setName(String setName) {
		name = setName;
	}

	public void sethp(int setHp) {
		if (setHp < 0) {
			System.out.println("잘못된 입력입니다.");
		} else {
			hp = setHp;
		}
	}

	public void setPower(int setPower) {
		if (setPower < 0) {
			System.out.println("잘못된 입력입니다.");
		} else {
			power = setPower;
		}
	}

	public void setDefense(int setDefense) {
		if (setDefense < 0) {
			System.out.println("잘못된 입력입니다.");
		} else {
			defense = setDefense;
		}
	}

}
