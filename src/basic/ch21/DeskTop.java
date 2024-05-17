package basic.ch21;
import java.util.Scanner;
import java.util.Random;
public class DeskTop extends Computer {
	
	
	
	@Override
	public void turnOn() {
		System.out.println("데스크탑을 켭니다.");
	}
	@Override
	public void turnOff() {
		System.out.println("데스크탑을 끕니다.");
	}
	@Override
	public void display() {
		int mood=0;
		boolean flag=true;
		
		while(flag) {
			System.out.println("------------------");
			System.out.println("메뉴를 선택해주세요.");
			System.out.println("1. 인터넷 검색 | 2. 파일 구경하기");
			Scanner sc=new Scanner(System.in);
			Random random=new Random();
			int choice=sc.nextInt();
			
			if(mood>=2) {
				System.out.println("눈이 피곤하다. 잠시 쉬고 오자...");
				break;
			}
			if(choice==1) {
				System.out.println("당신은 인터넷 서핑을 했다.");
				int a=random.nextInt(2);
				if(a==0) {
					System.out.println("이상한 글을 봐서 기분이 안 좋아졌다...");
					mood++;
				}
				else {
					System.out.println("앗! 시간이 어느새 2시간이나 지나가버렸다.");
				}
			}
			else if(choice==2) {
				System.out.println("당신은 데스크 탑 속의 파일들을 구경했다.");
				int a=random.nextInt(2);
				if(a==0) {
					System.out.println("몇 년 전의 사진들을 보고 추억에 빠졌다.");
				}
				else {
					System.out.println("언제 이런 사진들이 찍힌 거야!");
					mood++;
				}
			}
			else {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
			}
		}	
		}
		
	@Override
	public void typing() {
		System.out.println("오늘의 운세를 보시겠습니까?");
		System.out.println("1. 네 | 2. 아니오");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a==1) {
			Random random=new Random();
			int aa=random.nextInt(3);
			if(aa==0) {
				System.out.println("운세는 대길! 아주 즐거운 하루가 될 것 같습니다.");
			}
			else if(aa==1) {
				System.out.println("운세는 소길! 소소한 행복을 기대해 보세요.");
			}
			else if(aa==2) {
				System.out.println("운세는 소흉! 사소한 실수가 잦을지도 모릅니다.");
			}
			else {
				System.out.println("운세는 대흉! 오늘은 되도록 휴식하는게 좋겠습니다.");
			}
		}
	}

}
