package useful.ch05;

// 쓰레드를 추가하는 방법 - 상속을 활용할 수 있다.
// Thread -> Runnable -> Run()
public class MyThread extends Thread {
	// 우리가 정의한 클래스에서 run() 메서드 재정의 할 수 있다.
	// 쓰레드를 사용할 때 알아야 하는 필수 개념 - 그냥 외우자!
	// 쓰레드가 가지고 있는 메서드 start() 호출시키면, 
	// 약속으로 run() 메서드가 호출되어 동작하게 만들어져 있다.
	
	@Override
	public void run() {
		// 우리가 동작시키고자 하는 일을 정의해서 코드를 설계할 수 있다.
		// 임무 -> 반복문 200번을 수행해!
		for(int i=0; i<200; i++) {
			System.out.print(i+", ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
} // end of class
