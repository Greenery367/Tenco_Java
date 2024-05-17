package basic.ch10;

public class TestHero {
	public static void main(String[] args) {
		Hero hero1 = new Hero();
		hero1.setName("아이언맨");
		hero1.sethp(100);
		hero1.setDefense(-100);

		double a = hero1.getDefense();
		System.out.println(a);
	}

}
