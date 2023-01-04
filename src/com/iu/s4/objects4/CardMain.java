package com.iu.s4.objects4;

public class CardMain {
	public static void main(String[] args) {
		//클래스 명, 변수명
		System.out.println(Card.size);
		Card.staticMethod();
		
		Card card = new Card();
		card.setShape("Heart");
		card.setColor("Red");
		card.setNumber(1);
		card.info();
		
		Card.size = 8;
		
		Card card2 = new Card();
		card2.setShape("Spade");
		card2.setColor("Black");
		card2.setNumber(12);
		card2.info();
	}
}
