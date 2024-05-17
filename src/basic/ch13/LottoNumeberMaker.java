package basic.ch13;
import java.util.Arrays;
import java.util.Random;

public class LottoNumeberMaker {

	// 멤버 변수
	private static String version = "1.0.0";

	// main 함수
	public static void main(String[] args) {
	int[] lottos=makeNumbers();
	Arrays.sort(lottos);
	for(int i=0; i<lottos.length; i++) {
		System.out.print(lottos[i]+"\t");
	}

	} // end of main

	// 인스턴스에 속하지 않는 함수 만들기
	public static int makeNumber() {
		// static 함수 안에 멤버 변수를 사용할 수 없다.
		// because 메모리 뜨는 순서!
		// 자바 도구 - 표준 API
		// 난수 발생기 = 랜덤 값 생성기
		System.out.println("ver : " + version);
		Random random = new Random();
		int resultNumber = random.nextInt(45) + 1; // 0~45까지의 번호를 생성
		return resultNumber;
	}

	public static int[] makeNumbers() {
		int[] numbers = new int[6];
		Random random = new Random();
		int count=0;

		for (int i = 0; i < 6; i++) {
			numbers[i] = random.nextInt(45) + 1;
			for(int j=0; j<i; j++) {
				if(numbers[j]==numbers[j]) {
					i--;
					count++;
					break;
				}
			}
		}
		System.out.print(numbers[0]+"\t");
		System.out.print(numbers[1]+"\t");
		System.out.print(numbers[2]+"\t");
		System.out.print(numbers[3]+"\t");
		System.out.print(numbers[4]+"\t");
		System.out.println(numbers[5]+"\t");
		System.out.print(" 중복된 횟수는 "+count);
		
		return numbers;
	}

} // end of class
