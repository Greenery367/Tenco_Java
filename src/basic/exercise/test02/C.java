package basic.exercise.test02;

public class C {
	private D d;

	public String getD() {
		d=new D();
		return d.getName();
	}

	public void setD(D d) {
		this.d = d;
	}
	
}
