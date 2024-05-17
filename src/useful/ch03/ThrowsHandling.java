package useful.ch03;

public class ThrowsHandling {
	// 메인 스레드
	public static void main(String[] args) {

		Calc calc = new Calc();
		try {
			// 던져서 강제성이 발생이 되고,
			// 사용하는 사람이 직접 예외 처리 핸들링을 할 수 있다.
			calc.divide(10, 0);
		} catch (ArithmeticException e) {
			System.out.println("어떤 수를 0으로 나눌 수 없어요");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		Exception exception;

	} // end of main
} // end of class

class Calc {

	public int divide(int n1, int n2) throws Exception {
		// 사용자가 0입력하면 예외가 발생할 수 있는 코드 영역이다.
		// 해결 방법
		// 1. 해당 메서드에서 직접 예외 처리 구현
		// 2. 사용하는 사람이 직접 예외 처리를 할 수 있도록 던져버린다.
		return n1 / n2;
	}

}