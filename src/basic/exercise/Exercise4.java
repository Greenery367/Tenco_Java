package basic.exercise;
import java.util.Scanner;
public class Exercise4 {
	public static void main(String[] args) {
		// 코드의 시작점
		
		/**
		 * - 사용자에게 다음 옵션을 보여주고 선택하도록 요청합니다
    
        “1.등록 2.조회 3.수정 4.삭제 0.종료”
    
-        사용자가 옵션 번호를 입력하면, 해당 옵션에 대한 메시지를 출력합니다. 
         예를 들어, 사용자가 '1'을 선택하면 "등록을 선택했습니다."라고 출력합니다.
-        사용자가 '0'을 선택하면 "프로그램을 종료합니다."라는 메시지를 출력하고 프로그램을 종료합니다.
-        사용자가 유효하지 않은 번호를 입력하면 "잘못된 입력입니다. 다시 선택해주세요."라고 안내하고 
        다시 메뉴 선택을 할 수 있도록 합니다.
-        Scanner, while 그리고 if 구문을 활용해서 프로그램을 완성하세요.
		 * 
		 */
		System.out.println("\n메뉴 선택"); // \n:한 줄 내림
		System.out.println("1.등록 2.조회 3.수정 4.삭제 0.종료");
		System.out.print("선택 : ");
		
		

		boolean flag=true;
		
		while(flag) {
			Scanner sc=new Scanner(System.in);
			int choice=sc.nextInt(); //nextInt: 정수형으로 받아준다.
			
			if(choice==1) {
				System.out.println("등록을 선택했습니다.\n\n");
				System.out.println("-------------------------");}
			
			else if(choice==2) {
				System.out.println("조회를 선택했습니다.\n\n");
				System.out.println("-------------------------");
			}
			
			else if(choice==3) {
				System.out.println("수정을 선택했습니다.\n\n");
				System.out.println("-------------------------");
			}
			
			else if(choice==4) {
				System.out.println("삭제를 선택했습니다.\n\n");
				System.out.println("-------------------------");
			}
			
			else if(choice==0) {
				System.out.println("프로그램을 종료합니다.\n\n");
				System.out.println("-------------------------");
				break;
			}
			
			else {
				System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
			}
		
			if(choice==4) {
				flag=false;
			}
			
			System.out.println("\n메뉴 선택"); // \n:한 줄 내림
			System.out.println("1.등록 2.조회 3.수정 4.삭제 0.종료");
			System.out.print("선택 : ");
			}
		
	}// end of main

}// end of class
