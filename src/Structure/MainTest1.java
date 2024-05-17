package Structure;

public class MainTest1 {
	
	// 메인 쓰레드(함수의 시작)
	public static void main(String[] args) {
		TencoIntArray tencoIntArray = new TencoIntArray();
		tencoIntArray.addElement(100);
		tencoIntArray.addElement(200);
		tencoIntArray.addElement(300);
		tencoIntArray.addElement(400);
		//tencoIntArray.insertElement(5, 50); // 테스트 이후에 리팩토링 수정 - todo
		
		//tencoIntArray.printAll();
		System.out.println("---------------------");
		//System.out.println(tencoIntArray.getCountSize());
		System.out.println("---------------------");
		//System.out.println(tencoIntArray.isEmpty());
		System.out.println("---------------------");
		
		//tencoIntArray.removeAll();
		//tencoIntArray.printAll();
		tencoIntArray.removeElement(2);
		tencoIntArray.printAll();
		
	} // end of main

} // end of class
