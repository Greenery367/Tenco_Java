package basic.ch19;

public class ClassRoom {
	
	private String className;
	private Student[] students;//Student를 담을 수 있는 메모리 공간=배열
	private int studentCount;
	private final int MAX_STUDENT=30;
	
	// ClassRoom 생성자
	// String 타입으로 이름-멤버 변수를 할당받고,
	// Student 형의 변수를 직접적으로 받지 않기 때문에,
	// 의존관계라고 할 수 없다.
	// 마지막으로 멤버 변수인 studentCount를 0으로 초기화한다.
	public ClassRoom(String className) {
		this.className=className;
		students=new Student[MAX_STUDENT];
		this.studentCount=0;
	}
	
	// student 배열에 학생을 추가하는 메서드
	// 만약 상한선보다 배열의 변수 개수가 적다면
	// 배열에 새로운 student 형 변수를 생성한다.
	// 마지막으로 studentCount를 1 더해, 현재 변수 개수를 표현한다.
	public void addStudent(Student student) {
		if(studentCount<MAX_STUDENT) {
			students[studentCount]=student;
			studentCount++;
		}
		else {
			System.out.println("정원 초과입니다.");
		}
	}
	
	// 학급의 속한 모든 학생정보를 출력하는 메서드를 만드시오.
	// 정수형 변수 i는 배열의 크기보다 1 작을 때까지 반복한다.
	// 만약 student 변수의 i번째 객체가 null이 아니라면
	// 해당 객체의 변수를 출력한다.
	public void showStudents() {
		for(int i=0; i<students.length; i++) {
			if(students[i]!=null) {
				System.out.println(students[i].getAge()+"살 입니다.");
				System.out.println(students[i].getName()+" 입니다.");
			}
			System.out.println("출력 완료");
			break;
		}
	}
	
	public static void main(String[] args) {
		
	}
	
}
