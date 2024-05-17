package useful.ch04;

public class Warrior {
	private static Warrior warrior;
	
	private Warrior() {}
	
	public static Warrior getInstance() {
		if(warrior==null) {
			warrior=new Warrior();
		}
		return warrior;
	}

}
