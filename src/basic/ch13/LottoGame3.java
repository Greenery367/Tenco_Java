package basic.ch13;

public class LottoGame3 {

	public static void main(String[] args) {
		// static 변수=class 변수
		int gameNumber1 = LottoNumeberMaker.makeNumber();
		int gameNumber2 = LottoNumeberMaker.makeNumber();
		int gameNumber3 = LottoNumeberMaker.makeNumber();
		int gameNumber4 = LottoNumeberMaker.makeNumber();
		int gameNumber5 = LottoNumeberMaker.makeNumber();
		int gameNumber6 = LottoNumeberMaker.makeNumber();

		System.out.println("정렬 전");
		System.out.print(gameNumber1 + "/");
		System.out.print(gameNumber2 + "/");
		System.out.print(gameNumber3 + "/");
		System.out.print(gameNumber4 + "/");
		System.out.print(gameNumber5 + "/");
		System.out.println
		(gameNumber6 + "/");

		// 전체 1-6까지 나온 결과값을 오름 차 순으로 정렬
		// 단, 중복값 제외

		// 수식을 작성하라
		// 오름차순으로 정렬해보기
		// 만약->if문 / 반복문 사용 금지
		// if문 6개로 해결해라

		int tempBox = 0;
		
		
		for(int pass=1; pass<=6; pass++) {
			if (gameNumber1 > gameNumber2) {
				tempBox = gameNumber1;
				gameNumber1 = gameNumber2;
				gameNumber2 = tempBox;
			}
			if (gameNumber2 > gameNumber3) {
				tempBox = gameNumber2;
				gameNumber2 = gameNumber3;
				gameNumber3 = tempBox;
			}
			if (gameNumber3 > gameNumber4) {
				tempBox = gameNumber3;
				gameNumber3 = gameNumber4;
				gameNumber4 = tempBox;
			}
			if (gameNumber4 > gameNumber5) {
				tempBox = gameNumber4;
				gameNumber4 = gameNumber5;
				gameNumber5 = tempBox;
			}
			if (gameNumber5 > gameNumber6) {
				tempBox = gameNumber5;
				gameNumber5 = gameNumber6;
				gameNumber6 = tempBox;
			}
			if (gameNumber6 > gameNumber1) {
				tempBox = gameNumber6;
				gameNumber6 = gameNumber1;
				gameNumber6 = tempBox;
			}
		} // end of for

		System.out.println("정렬 후");
		System.out.print(gameNumber1 + "/");
		System.out.print(gameNumber2 + "/");
		System.out.print(gameNumber3 + "/");
		System.out.print(gameNumber4 + "/");
		System.out.print(gameNumber5 + "/");
		System.out.print(gameNumber6 + "/"
				);

	} // main 함수

}
