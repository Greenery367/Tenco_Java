package basic.ch04;

public class WhileTest3 {
	public static void main(String[] args) {
	//코드의 시작점
		
		System.out.println("--------------------");
		
		int start1=1;
		boolean button=true;
		
		while(button) {
			System.out.println(start1);
			start1++;
			if(start1==11) {
				button=false;
				return;
			}
		}
	}//end of main

}//end of class
