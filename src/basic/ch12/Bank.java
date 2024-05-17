package basic.ch12;

public class Bank {
	private static int number;
	private static String name;
	
	public Bank(String name) {
		this.name=name;
	}
	
	public int getNumber() {
		return this.number;}
	
	public String getName() {
		return this.name;
	}
	
	public void setNumber(int number) {
		this.number=number;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
}
