package basic.ch12;

public class NumberPrinterTest {
	public static void main(String[] args) {
		 
		NumberPrinter printer1=new NumberPrinter(1); // 왼쪽
		NumberPrinter printer2=new NumberPrinter(2); // 오른쪽
		printer1.printWaitNumber(); // 1번 고객
		printer1.printWaitNumber(); // 2번 고객
		printer1.printWaitNumber(); // 3번 고객
		printer1.printWaitNumber(); // 4번 고객
		
		printer2.printWaitNumber(); // 5번 고객
		printer2.printWaitNumber(); // 6번 고객
		
		
	} // end of main

} // end of class
