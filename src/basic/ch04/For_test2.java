package basic.ch04;

public class For_test2 {
	// 코드의 시작점
	public static void main(String[] args) {
		
		int num = 2;	
		System.out.println(num+"x"+"1="+(num*1));
		System.out.println(num+"x"+"2="+(num*2));
		System.out.println(num+"x"+"3="+(num*3));
		System.out.println(num+"x"+"4="+(num*4));
		System.out.println(num+"x"+"5="+(num*5));
		System.out.println(num+"x"+"6="+(num*6));
		System.out.println(num+"x"+"7="+(num*7));
		System.out.println(num+"x"+"8="+(num*8));
		System.out.println(num+"x"+"9="+(num*9));

		
		System.out.println("-------------------");
		
		num=3; //변수의 효용: 언제든 접근해서 활용이 가능하다.
		System.out.println(num+"x"+"1="+(num*1));
		System.out.println(num+"x"+"2="+(num*2));
		System.out.println(num+"x"+"3="+(num*3));
		System.out.println(num+"x"+"4="+(num*4));
		System.out.println(num+"x"+"5="+(num*5));
		System.out.println(num+"x"+"6="+(num*6));
		System.out.println(num+"x"+"7="+(num*7));
		System.out.println(num+"x"+"8="+(num*8));
		System.out.println(num+"x"+"9="+(num*9));
		
		
		System.out.println("-------------------");
		
		++num; //변수의 효용: 언제든 접근해서 활용이 가능하다.
		System.out.println(num+"x"+"1="+(num*1));
		System.out.println(num+"x"+"2="+(num*2));
		System.out.println(num+"x"+"3="+(num*3));
		System.out.println(num+"x"+"4="+(num*4));
		System.out.println(num+"x"+"5="+(num*5));
		System.out.println(num+"x"+"6="+(num*6));
		System.out.println(num+"x"+"7="+(num*7));
		System.out.println(num+"x"+"8="+(num*8));
		System.out.println(num+"x"+"9="+(num*9));
		
		
        System.out.println("-------------------");
		
		
		num=5;
		for(int i = 1; i < 10; i++) {
			System.out.println(num + "x" + i + "=" + (num*i));}
			
		//for 문을 사용해서 1~9단을 출력하시오.
		int foward=1;
		int back=1;
		
		for(foward = 1; foward < 10; foward++) {
			System.out.println("-------------------");
			System.out.println( foward + " 단을 시작합니다.");
			for(back = 1; back<10; back++) {
				System.out.println( foward + "x" + back + "=" + (foward * back));
			}
		}

	}// end of main

}// end of class
