package basic.ch04;

import java.util.Scanner;

public class IfElseExercise {
	// 코드의 시작점
	public static void main(String[] args) {

		// 정수값 입력 받기
		System.out.println("점수를 입력하시오.");

		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();

		char grade = 'x';// 초기값을 x로 설정해, 잘못된 입력을 쉽게 확인
		String message = ""; // 추가적인 피드백 메세지

		if (score < 101 && score > 89) {
			System.out.println("당신의 점수는 A입니다.");
			message = "우수한 성적이네요! 계속 좋은 성적 유지하길 바랍니다.";
			System.out.println(message);} 
		
		else if (score < 90 && score > 79) {
			System.out.println("당신의 점수는 B입니다.");
			message = "좋은 성적입니다. 조금만 더 노력하면 A도 가능해요!";
			System.out.println(message);} 
		
		else if (score < 80 && score > 69) {
			System.out.println("당신의 점수는 C입니다.");
			message = "괜찮은 성적이지만, 더 높은 등급을 위해 노력해봅시다.";
			System.out.println(message);} 
		
		else if (score > 70 && score > 59) {
			System.out.println("당신의 점수는 D입니다.");
			message = "학습에 더 집중할 필요가 있어요. 도움이 필요하면 말해주세요.";
			System.out.println(message);} 
		
		else if (score < 70 && score <= 0) {
			System.out.println("당신의 점수는 F입니다.");
			message = "불합격입니다. 부족한 부분을 파악하고, 추가 학습이 필요해요.";
			System.out.println(message);} 
		
		else {
			System.out.println("입력하신 성적이 범위를 벗어났습니다. 프로그램을 다시 실행해주세요.");
		}
		// end of if

		scanner.close();
	}// end of main

}// end of class
