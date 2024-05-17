package basic.ch09;

import java.util.Scanner;

public class GoingToSchool2 {

	// 설계된 클래스를 가지고, 본인이 의도한 대로 실행의 흐름을 만들어보자.
	public static void main(String[] args) {
		// 1. 스캐너를 활용해, 1번을 누르면 버스를 태워서 실행의 흐름 만들기.
		// 2. 스캐너를 활용해, 2번을 누르면 지하철을 태워서 실행의 흐름 만들기.

		Bus bus1 = new Bus(100);
		Bus bus2 = new Bus(200); // 선언만 했음
		Subway subway1 = new Subway(1);
		Subway subway2 = new Subway(2);
		Student s1 = new Student("티모", 100_00);
		Student s2 = new Student("가츠", 200_00);

		while(true) {
			System.out.println("-----------");
			System.out.println("등교를 시작합니다!");
			System.out.println("-----------");
	
			Scanner sc = new Scanner(System.in);
			System.out.println(" 메뉴를 선택하세요.");
			System.out.println(" 1번 버스 / 2번 지하철");
	
			int choice = sc.nextInt();
	
			// 버스를 탈 경우
			if (choice == 1) {
				System.out.println("탈 버스를 선택하세요.");
				System.out.println(" 100번 / 200번 ");
				int choiceBus = sc.nextInt();
				if (choiceBus == 100) {
					System.out.println(" 100 번 버스를 고르셨습니다.");
					System.out.println(" 운행을 시작합니다. ");
					System.out.println(" 1500원이 납부되었습니다. ");
					bus1.take(1500);
					bus1.showInfo();
				} else if (choiceBus == 200) {
					System.out.println(" 200 번 버스를 고르셨습니다.");
					System.out.println(" 운행을 시작합니다. ");
					System.out.println(" 1500원이 납부되었습니다. ");
					bus2.take(1500);
					System.out.println("-----------"+"\n");
					bus2.showInfo();
				}
			}
	
			// 지하철을 탈 경우
			if (choice == 2) {
				System.out.println("탈 지하철 호선을 선택하세요.");
				System.out.println(" 1호선 / 2호선 ");
				int choiceSubway = sc.nextInt();
				if (choiceSubway == 1) {
					System.out.println(" 1호선을 고르셨습니다.");
					System.out.println(" 운행을 시작합니다. ");
					System.out.println(" 1200원이 납부되었습니다. ");
					subway1.take(1200);
					System.out.println("-----------");
					subway1.showInfo();
					
				} else if (choiceSubway == 2) {
					System.out.println(" 2호선을 고르셨습니다.");
					System.out.println(" 운행을 시작합니다. ");
					System.out.println(" 1200원이 납부되었습니다. ");
					subway2.take(1200);
					System.out.println("-----------");
					subway2.showInfo();
				}
			}
		}

	}
} // end of class
