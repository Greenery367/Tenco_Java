package starcraft.ver02;

import java.util.Scanner;

public class StarCraftTest2 {
	public static void main(String[] args) {

		final int ZEALOT = 1;
		final int MARINE = 2;
		final int ZERGLING = 3;
		final int GAME_END = 0;
		// 상수는 대문자로 적는 것이 권장사항이다.

		Gateway gateway1 = new Gateway(1);
		Gateway gateway2 = new Gateway(2);
		Zealot zealot1 = gateway1.createZealot("질럿1");
		Zealot zealot2 = gateway1.createZealot("질럿2");
		System.out.println(gateway1.getGatewayNumber()+":"+gateway1.getCount());
		System.out.println(gateway2.getGatewayNumber()+":"+gateway2.getCount());
		System.out.println("-----------------");
		
		Zergling zergling1=gateway2.creatZergling("지나가는 저글링");
		Zergling zergling2=gateway2.creatZergling("저기가는 저글링");
		System.out.println(gateway2.getGatewayNumber()+":"+gateway2.getCount());
		System.out.println("-----------------");
		
		Marine marine3=gateway1.createMarine("걸어가는 해병");
		Marine marine4=gateway2.createMarine("귀신잡는 해병2");
		System.out.println(gateway1.getGatewayNumber()+":"+gateway1.getCount());
		System.out.println(gateway2.getGatewayNumber()+":"+gateway2.getCount());
		System.out.println("-----------------");
		

		Scanner sc = new Scanner(System.in);
		int unitChoice = -1;

		do {
			System.out.println("유닛을 선택하세요.");
			System.out.println("1. 질럿 \t 2. 마린  \t 3. 저글링 \t 0. 게임 종료");
			unitChoice = sc.nextInt();

			if (unitChoice == ZEALOT) {

			} else if (unitChoice == MARINE) {

			} else if (unitChoice == ZERGLING) {

			} else {
				System.out.println("프로그램을 종료합니다.");
				unitChoice = GAME_END;
				// 변수를 사용해 보다 가독성을 높일 수 있다!(직관적인 코드)
			}

		} while (unitChoice != GAME_END);

		// while 문 <--- 기본 while문 / do while
		// 기본 while문: 조건식을 확인 후, 코드를 수행한다.
		// do while문: 무조건 한 번은 수행을 하고, 다시 조건을 확인한다.
		// do while문은 형태도 다르다. do{수행식}while(조건식)

	}

}
