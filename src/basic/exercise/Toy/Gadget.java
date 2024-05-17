package basic.exercise.Toy;

import java.util.Random;

public class Gadget extends Product {

	public Gadget(String name) {
		super(name);
	}

	public void getGadet() {
		System.out.println("축하합니다, " + "기계를 뽑았습니다!");
	}
	
	public void check() {
		Random random=new Random();
		int a=random.nextInt(2);
		if(a==0) {
			System.out.println("슬슬 이것도 바꿀 때가 된 것 같다.");
		}
		else {
			System.out.println("넣은 지 오래 된 기계인데도, 아직 튼튼하다.");
		}
	}

}
