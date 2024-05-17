package starcraft.ver05;

public class StarCraftTest1 {
	public static void main(String[] args) {
		
		Zealot zealot=new Zealot("잠자던 질럿");
		Marine marine=new Marine("밥먹던 마린");
		Zergling zergling=new Zergling("야근하는 저글링");
		
		zealot.showInfo();
		marine.showInfo();
		zergling.showInfo();
		
		
		System.out.println("-----------------");
		zergling.attack(marine);
		marine.showInfo();
		marine.attack(zealot);
		zealot.showInfo();
		
	} // end of main

} // end of class
