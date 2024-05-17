package useful.ch05;

/*
 * 쓰레드를 만드는 두번째 방법,
 * Runnable 인터페이스를 활용한다.
 */

public class MyThread2 implements Runnable{

	// Thread 클래스에서 start 메서드가 호출되면
	// 동작하는 부분이라고 약속되어 있다.
	@Override
	public void run() {
		int i=0;
		while(i<10) {
			System.out.println("i :"+i);
			i++;
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
