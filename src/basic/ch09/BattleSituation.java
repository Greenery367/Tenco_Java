package basic.ch09;

import java.util.Scanner;

public class BattleSituation {

	public static void main(String[] args) {

		Warrior warrior1 = new Warrior("홍길동", 1, 100, 30);
		Archer archer1 = new Archer("임꺽정", 1, 60, 70);
		Magician magician1 = new Magician("마법사", 1, 30, 100);
		Warrior warrior2 = new Warrior("지나가는 오크", 1, 30, 30);

		boolean flag = true;

		while (flag) {
			System.out.println("----------------");
			System.out.println("게임을 시작합니다.");
			System.out.println();

			warrior2.reSet(warrior2);

			System.out.println("----------------");
			System.out.println("캐릭터를 선택하세요.");
			System.out.println("1. 전사 / 2. 마법사 / 3. 궁수");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			System.out.println("----------------");
			System.out.println();

			if (choice == 1) {

				System.out.println("전사를 선택했습니다.");
				System.out.println("전투를 시작합니다.");
				System.out.println("----------------");
				System.out.println();
				warrior1.checkMe();
				System.out.println();

				boolean keep = (warrior1.health) > 0;

				while (keep) {
					System.out.println("무엇을 할까요?");
					System.out.println("1.공격하기 / 2.도망치기 / 3.종료하기");
					System.out.println();
					int choice2 = sc.nextInt();
					if (choice2 == 1) {
						warrior1.hit(warrior2);
						System.out.println();
						System.out.println();

						if (warrior1.health < 0) {
							System.out.println("이런, 전투에서 패배했다...");
							System.out.println("가진 돈을 모두 잃었다.");
							System.out.println("마을로 돌아가자.");
							warrior1.money = 0;
							warrior1.checkMe();
							break;
						}

						else if (warrior1.critical == 10) {
							warrior1.levelUp();
							System.out.println();
						}

						else if (warrior2.health <= 0) {
							System.out.println("야호! 전투에서 승리했다!");
							System.out.println();
							warrior1.levelUp();
							warrior1.checkMe();
							break;
						}

						warrior2.hit(warrior1);
						System.out.println("이런!" + warrior1.health + "만큼의 체력이 남았다.");
						System.out.println();

					} else if (choice2 == 2) {
						warrior1.run();
						warrior1.checkMe();
						break;
					} else {
						System.out.println("전투를 종료합니다.");
						warrior1.checkMe();
						flag = false;
						break;
					}
				}
			}

			if (choice == 2) {

				System.out.println("마법사를 선택했습니다.");
				System.out.println("전투를 시작합니다.");
				System.out.println("----------------");
				System.out.println();
				magician1.checkMe();
				System.out.println();

				boolean keep = (magician1.health) > 0;

				while (keep) {
					System.out.println("무엇을 할까요?");
					System.out.println("1.공격하기 / 2.도망치기 / 3.종료하기");
					System.out.println();
					int choice2 = sc.nextInt();
					if (choice2 == 1) {
						magician1.hit(warrior2);
						System.out.println();
						System.out.println();

						if (magician1.health <= 0) {
							System.out.println("이런, 전투에서 패배했다...");
							System.out.println("가진 돈을 모두 잃었다.");
							System.out.println("마을로 돌아가자.");
							magician1.money = 0;
							magician1.checkMe();
							break;
						}

						else if (magician1.critical == 10) {
							magician1.levelUp();
							System.out.println();
						}

						else if (warrior2.health <= 0) {
							System.out.println("야호! 전투에서 승리했다!");
							System.out.println();
							warrior1.levelUp();
							magician1.checkMe();
							break;
						}

						warrior2.hit(magician1);
						System.out.println("이런!" + magician1.health + "만큼의 체력이 남았다.");
						System.out.println();

					} else if (choice2 == 2) {
						magician1.run();
						magician1.checkMe();
						break;
					} else {
						System.out.println("전투를 종료합니다.");
						magician1.checkMe();
						flag = false;
						break;
					}
				}
			}

			if (choice == 3) {

				System.out.println("궁수를 선택했습니다.");
				System.out.println("전투를 시작합니다.");
				System.out.println("----------------");
				System.out.println();
				archer1.checkMe();
				System.out.println();

				boolean keep = (archer1.health) > 0;

				while (keep) {
					System.out.println("무엇을 할까요?");
					System.out.println("1.공격하기 / 2.도망치기 / 3.종료하기");
					System.out.println();
					int choice2 = sc.nextInt();
					if (choice2 == 1) {
						archer1.hit(warrior2);
						System.out.println();
						System.out.println();

						if (archer1.health <= 0) {
							System.out.println("이런, 전투에서 패배했다...");
							System.out.println("가진 돈을 모두 잃었다.");
							System.out.println("마을로 돌아가자.");
							archer1.money = 0;
							archer1.checkMe();
							break;
						}

						else if (archer1.critical == 10) {
							archer1.levelUp();
							System.out.println();
						}

						else if (warrior2.health <= 0) {
							System.out.println("야호! 전투에서 승리했다!");
							System.out.println();
							archer1.levelUp();
							magician1.checkMe();
							break;
						}

						warrior2.hit(archer1);
						System.out.println("이런!" + archer1.health + "만큼의 체력이 남았다.");
						System.out.println();

					} else if (choice2 == 2) {
						archer1.run();
						archer1.checkMe();
						break;
					} else {
						System.out.println("전투를 종료합니다.");
						archer1.checkMe();
						flag = false;
						break;
					}
				}
			}

		}

	}

}
