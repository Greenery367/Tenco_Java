package basic.ch19;

public class ClassRoomTest {
	public static void main(String[] args) {
		ClassRoom classroom=new ClassRoom("C4");
		Student student1=new Student("홍길동",11);
		Student student2=new Student("이순신",1);
		
		classroom.addStudent(student1);
		classroom.addStudent(student2);
		classroom.showStudents();
	}

}
