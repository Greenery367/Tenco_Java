package io.ch08;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MyObjectStream2 {
	
	public static void main(String[] args) {
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.txt"))){
			Person person = new Person ("장발장",45);
			oos.writeObject(person);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("----------");
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.txt"))) {
			Person person = (Person)ois.readObject();
			System.out.println(person);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
