package basic.exercise.Toy;

public abstract class Product {
	String name;
	int price;

	public Product(String name) {
		this.name = name;}
	
	public abstract void check();
	
}

