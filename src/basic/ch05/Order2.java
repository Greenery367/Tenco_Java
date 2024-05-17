package basic.ch05;

public class Order2 {
	public static void main(String[] args) {
		Order NewOrder1=new Order();
		Order NewOrder2=new Order(); 
		Order NewOrder3=new Order();
		
		NewOrder1.food="항정살 덮밥";
		NewOrder1.time="2시 예약";
		NewOrder1.disposable=true;
		
		NewOrder2.food="불대창 덮밥";
		NewOrder2.time="5시 예약";
		NewOrder2.disposable=false;
		
		NewOrder3.food="연어회 덮밥";
		NewOrder3.time="5시 예약";
		NewOrder3.disposable=true;
		
		System.out.print(NewOrder1.food);
		System.out.print(NewOrder1.time);
		System.out.print(NewOrder1.disposable);
	}

	
}
