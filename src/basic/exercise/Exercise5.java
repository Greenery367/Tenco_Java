package basic.exercise;
import java.util.Scanner;
public class Exercise5 {
	public static void main(String[] args) {
		// 코드의 시작점
		
		// 별 찍기 도전 
		// 1 단계 - 세로 반복의 횟수 (for 횟수)
		
		// * - 1
		// ** -2
		// *** -3
		// **** -4
		// ***** -5
		
		for(int i = 0; i < 5; i++){
			
		}
		
		// 2 단계 - 
		System.out.print("*");
		System.out.println();
		System.out.print("**");
		System.out.println();
		System.out.print("***");
		System.out.println();
		System.out.print("****");
		System.out.println();
		System.out.print("*****");
		System.out.println();
		
		System.out.println("-----------------");
		
		for (int j = 0; j < 1; j++) { // 1번 동작
			System.out.print("*");
		}
		System.out.println();
		
		for (int j = 0; j < 2; j++) { // 1번 동작
			System.out.print("*");
		}
		System.out.println();
		
		for (int j = 0; j < 3; j++) { // 1번 동작
			System.out.print("*");
		}
		System.out.println();
		
		for (int j = 0; j < 4; j++) { // 1번 동작
			System.out.print("*");
		}
		System.out.println();
		
		// 3 단계 -
		// outer for
        for(int i = 0; i < 5; i++){ //5번 반복
        	// inner for
        	// 첫 번째 동작 j = 0, j <= 0 ----> 한 번 동작 -> * -> 줄바꿈
        	// 두 번째 동작 j = 0, j <= 1 ----> 두 번 동작 -> ** -> 줄바꿈
        	// 세 번째 동작 j = 0, j <= 1 ----> 세 번 동작 -> *** -> 줄바꿈
        	for (int j = 0; j <= i; j++) { // 1번 동작
    			System.out.print("*");
    		}
    		System.out.println();	
		}
		
		
	}// end of main

}// end of class
