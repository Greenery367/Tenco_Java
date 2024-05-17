package basic.ch16;

public class Profile {
	public static void main(String[] args) {
		Profile p1=new Profile("엄송현",20);
		
		p1.print();
		p1.print("헬로키티");
		p1.print(0);
		p1.print("지나가는 사람",30);
		
	}
	private String name;
	private String country;
	private int temperture;
	
	public Profile(String name, int temperture) {
		this.name=name;
		this.temperture=temperture;
	}
	
	
	public void print() {
		System.out.println("내 이름은 "+this.name+"입니다.");
		System.out.println("오늘의 날씨는 "+this.temperture+"도 입니다.");
	}
	
	public void print (String name) {
		System.out.println("내 이름은 "+name+"입니다.");
	}
	public void print (int temperture) {
		System.out.println("오늘의 날씨는 "+temperture+"도 입니다.");
	}
	public void print (String name, int temperture) {
		System.out.println("내 이름은 "+name+"이고, 오늘의 날씨는 "+temperture+"입니다.");
	}
}
