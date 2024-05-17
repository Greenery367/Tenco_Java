package starcraft.ver02;

public class StarCraftTest1 {
	public static void main(String[] args) {

		// 질럿, 저글링, 마린 객체 생성 (각각 2개씩)
		Zealot z1 = new Zealot("천하무적질럿1");
		Zealot z2 = new Zealot("질럿2");
		Zergling z11 = new Zergling("저글링1");
		Zergling z22 = new Zergling("저글링2");
		Marine m1 = new Marine("귀신잡는해병1");
		Marine m2 = new Marine("마린2");
		
		// z1이 m2를 15번 공격하고, 상태창을 출력해라.
		for(int i=0; i<15; i++) {
			z1.attack(m2);
		}
		m2.showInfo();
		

	}

}
