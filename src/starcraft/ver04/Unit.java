package starcraft.ver04;
/**
 * 접근 제어 지시자
 * public
 * protected
 * default
 * private
 */
public class Unit {
	
	protected String name;
	protected int power;
	protected int hp;

	public Unit(String name) {
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public void showInfo() {
		System.out.println("=====상태창=====");
		System.out.println(" 이름: "+this.name);
		System.out.println(" 공격력: "+this.power);
		System.out.println(" 생명력: "+this.hp);
	}
	
	public void beAttacked(int power) {
		if (hp <= 0) {
			System.out.println("[" + this.name + "]은 이미 사망했습니다.");
			hp = 0;
			return;
		}
		hp -= power;
	}
	
	public void attack(Unit u) {
		System.out.println("[" + this.name + "]가 "+u.name+"를 공격합니다.");
		beAttacked(this.power);}
}
