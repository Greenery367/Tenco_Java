package basic.ch21;
import java.util.Scanner;
public class MyNoteBook extends NoteBook {
	Scanner sc=new Scanner(System.in);
	
	@Override
	public void display() {
		System.out.println("화면이 꺼져 있다.");
	}
	
	public void typing() {
		System.out.println("오늘의 일기를 써보자.");
		String diary=sc.nextLine();
		System.out.println("-----------------");
		System.out.println("----오늘의 일기----");
		System.out.println(diary);
		System.out.println("-----------------");
		System.out.println("내일도 힘차게!");
	}
}
