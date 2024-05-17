package basic.ch20;

public class FruitTest {
	public static void main(String[] args) {
		
		//다형성
		//다양한 형태로 클래스, 또는 데이터 타입을 바라볼 수 있다.
		
		Fruit fruit1=new Banana();
		Banana banana=new Banana(); //업캐스팅: 부모의 데이터 타입으로 자식 클래스의 객체 대입
		Peach peach=new Peach(); 
		
		System.out.println("------------");
		
		// 다형성을 사용하면
		// 코드를 유연하게 사용할 수 있다.
		Fruit[] fruits=new Fruit[3];
		fruits[0]=banana;
		fruits[1]=peach;
		fruits[2]=peach;
		
		System.out.println(((Banana)fruits[0]).origin);
		((Banana)fruits[0]).saleBanana();
		
		System.out.println(banana.origin);
		banana.saleBanana();
		System.out.println("------------");
		
		// 0 -> 바나나
		// 1 -> 복숭아
		
		// instanceof 연산자
		for(int i=0; i<fruits.length; i++) {
			if(fruits[i] instanceof Banana) {
				((Banana)fruits[i]).saleBanana();	
			} else {
				fruits[i].showinfo();
			}
		}
		
	}

}
