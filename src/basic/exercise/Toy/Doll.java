package basic.exercise.Toy;

import java.util.Random;

public class Doll extends Product {

	public Doll(String name) {
		super(name);
	}

	public void getDoll() {
		System.out.println("축하합니다, " + this.name + "인형을 뽑았습니다!");
	}

	public void check() {
		Random random = new Random();
		int a = random.nextInt(2);
		if (a == 0) {
			System.out.println("먼지가 쌓이고 실이 삭았다. 새걸로 교체해주자.");
		} else {
			System.out.println("아직 새 것처럼 예쁜 인형이다.");
		}
	}

}
