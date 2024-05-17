package basic.ch09;

public class GoingToSchool {
	public static void main(String[] args) {
		// 함수의 시작점
		
		// 객체 지향 프로그래밍이란
		// 객체와 객체 간의 관계를 형성하고
		// 상호작용하게 프로그래밍하는 것.
		
		Bus bus1=new Bus(100);
		Bus bus2=new Bus(200);
		Subway subway1=new Subway(1);
		Subway subway2=new Subway(2);
		Subway subway3=new Subway(3);
		
		
		// 집중!
		Student student1=new Student("홍길동",10_000);
		student1.showInfo();
		
		// 학생이 버스를 탄다, 라는 행위를 시키고 싶다.
		System.out.println("-----------");
		
		student1.takeBus(bus2);
		student1.showInfo();
		
		System.out.println("-----------");
		student1.takeSubway(subway1);
		student1.showInfo();
		subway1.showInfo();
		System.out.println("-----------");
		subway2.showInfo();
		
		// 학생이 지하철을 탄다, 라는 행위를 시키고 싶다.
		
	} // end of main

} // end of class
