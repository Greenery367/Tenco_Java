package useful.ch05;

import java.util.Iterator;

// HOW, WHY
public class Worker extends Thread{

	private String name;
	
	public Worker(String name) {
		this.name=name;
	}
	
	// 약속된 부분 --> run() 메서드를 정의하면 된다
	@Override
	public void run() {
		for(int i=0; i<50; i++) {
			System.out.println("worker : "+name+" : "+i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
