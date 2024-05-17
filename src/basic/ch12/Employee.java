package basic.ch12;

public class Employee {

	private int employeeId; // 멤버 변수(객체마다 고유의 값을 가져야 한다.)
	private String name;
	private String department;
	private int serialNumber;

	// 요구 조건
	// 사원이 존재하게 될 때마다 고유한 사원 번호를 할당하고 싶다.
	// 단, 사원 번호는 중복되어서는 안된다.

	// static과 멤버 변수에 활용
	// 객체 생성자, 멤버 변수, 함수를 필요하다 호출 또는 초기화 할 수 있다.

	// static과 멤버 변수의 활용
	public Employee(String name) {
		this.name = name;
		this.employeeId = Company.empSerialNumber;
		Company.empSerialNumber++;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}

}
