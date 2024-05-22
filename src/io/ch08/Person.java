package io.ch08;

import java.io.Serializable;

// 특정 클래스를 직렬화하기 위해서는 상위 부모, 혹은 바로 
public class Person implements Serializable{

	private static final long serialVersionUID = 1L; // 직렬화 버전
	// L = 접미사 (Long 타입으로 구별해주는 것)
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	@Override
	public String toString() {
		return "Person [name ="+name+", age="+age+"]";
	}
	
	
}
