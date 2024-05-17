package basic.exercise.Toy;

import java.util.Random;
// 인형 뽑기 설계하기
// 상품들이 존재 가능
// 사자 인형, 곰 인형, 에어팟

// 요구 조건
// 배열을 활용해서 객체들을 담아주세요
public class ToyMachine {
	private int have = 0;
	private int tryNumber = 0;
	private final int MAX_NUMBER = 4;
	private Product[] products;

	// 배열 return
	public Product[] getProducts() {
		return products;
	}

	// setter 메서드
	public void setProducts(Product[] products) {
		this.products = products;
	}

	// 사용자 정의 생성자
	public ToyMachine() {
		products = new Product[MAX_NUMBER];
	}

	// ToyMachine에 toy 넣기
	public void addProduct(Product product) {
		// 0 < 4
		if (have < MAX_NUMBER) { // 최대 용량보다 가진 toy 수가 적을 때 
			products[have] = product; //(가진 갯수)번째 products 배열 값에 product를 넣는다.
			have++;
		}
	}
	
	public void showInfo() {
		for(int i=0; i<have; i++) {
			if(products[i]!=null) {
				System.out.println(products[i].name);
			}
		}
	}
	

	public void start() {
		System.out.println("인형뽑기를 시작합니다."); 
		
		Random random = new Random();
		int i = random.nextInt(3) + 1; // toy 랜덤 값
		int num = random.nextInt(10); // 이벤트 랜덤 값
		System.out.println(products[i].name + "이 나왔습니다.");
		if (num == 4) { // num이 4이면 fail() 이벤트 발생
			fail();
		} else if (num == 7) { // num이 7이면 lucky() 이벤트 발생
			lucky();
		}
	}

	public void fail() {
		System.out.println("앗!");
		System.out.println("상품을 중간에 놓쳐버렸다!");
	}

	public void lucky() {
		System.out.println("럭키!");
		Random random = new Random();
		int i1 = random.nextInt(3) + 1;
		System.out.println(products[i1].name + "를 함께 뽑았다!");
	}

}
