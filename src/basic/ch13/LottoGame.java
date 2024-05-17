package basic.ch13;

public class LottoGame {
	
	public static void main(String[] args) {
		// static 변수=class 변수
		int gameNumber1 = LottoNumeberMaker.makeNumber();
		int gameNumber2 = LottoNumeberMaker.makeNumber();
//		int gameNumber3 = LottoNumeberMaker.makeNumber();
//		int gameNumber4 = LottoNumeberMaker.makeNumber();
//		int gameNumber5 = LottoNumeberMaker.makeNumber();
//		int gameNumber6 = LottoNumeberMaker.makeNumber();
		
		System.out.println("정렬 전");
		System.out.print(gameNumber1+"\t");
		System.out.println(gameNumber2+"\t");
		System.out.println("=============");
//		System.out.print(gameNumber3+"\t");
//		System.out.print(gameNumber4+"\t");
//		System.out.print(gameNumber5+"\t");
//		System.out.print(gameNumber6+"\t");
		
		// 예상 1box=5 / 2box=3
		int tempBox=0;
		if(gameNumber1>gameNumber2) {
			//   0->5
			tempBox=gameNumber2;
			//   5->3
			gameNumber1=gameNumber2;
			//   3->5
			gameNumber2=tempBox;
		}
		// 정렬 -> 3,5
		
		
		int a=gameNumber1;
		int b=gameNumber2;
		if(a>b) {
			gameNumber1=b;
			gameNumber2=a;
		}
		
		System.out.println("정렬 후");
		System.out.print(gameNumber1+"\t");
		System.out.print(gameNumber2+"\t");
		
		// 오름차순으로 정렬해보기
		
	} // main 함수

}
