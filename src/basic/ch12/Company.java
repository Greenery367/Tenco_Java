package basic.ch12;

public class Company {

	public static String companyName = "그린 컴퍼니";
	static int empSerialNumber = 1000;

	// 코드 테스트
	public static void main(String[] args) {
		// 코드의 시작점

		Employee employee1 = new Employee("홍길동");
		System.out.println(employee1.getEmployeeId());
		Employee employee2 = new Employee("임꺽정");
		System.out.println(employee2.getEmployeeId());
		Employee employee3 = new Employee("신사임당");
		System.out.println(employee3.getEmployeeId());

	}

}
