package basic.ch21;

public class ComputerTest {
	
	public static void main(String[] args) {
		Computer d1=new DeskTop();
		Computer m1=new MyNoteBook();
		
		//((DeskTop)d1).turnOff(); // 데스크탑 끄기
		//((DeskTop)d1).turnOn(); // 데스크탑 켜기
		//((DeskTop)d1).display(); // 데스크탑 사용하기
		//((DeskTop)d1).typing(); // 운세 보기
		
		m1.display();
		m1.typing();
	}

}
