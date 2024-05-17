package basic.ch12;

public class Card {
	// 멤버 변수, static 변수
	private String name;
	private static int cardNumber = 11111;

	// 생성자
	public Card(String name) {
		this.name = name;
		this.cardNumber = Card.cardNumber;
		Card.cardNumber += 1001;
	}

	// 멤버 함수

	// get, set 작성
	public String getName() {
		return this.name;
	}

	public int getCardNumber() {
		return this.cardNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Card card1 = new Card("신한카드");
		System.out.println(Card.cardNumber);
		Card card2 = new Card("현대카드");
		System.out.println(Card.cardNumber);
		Card card3 = new Card("국민카드");
		System.out.println(Card.cardNumber);
	} // end of main

} // end of class
