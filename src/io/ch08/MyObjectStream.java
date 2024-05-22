package io.ch08;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MyObjectStream {
	
	public static void main(String[] args) {
		// 객체 직렬화
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.txt"))) {
			Person person = new Person ("손흥민", 30);
			oos.writeObject(person);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("------------");
		
		
		// 객체 역직렬화
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.txt"))){
			// 문자 기반 데이터를 읽으면 <--- 스트링 값 추출해서 코드상에 활용할 수 있도록 
			// Object 만드는 코딩을 해야한다.
			Person person = (Person)ois.readObject();
			// ois를 person으로 다운캐스팅(Object->person)
			// readObject = final 타입 메서드
			// final 타입 메서드: 상속 후 재정의할 수 없게 한 메서드
			System.out.println(person);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
