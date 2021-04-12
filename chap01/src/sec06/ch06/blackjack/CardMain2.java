package sec06.ch06.blackjack;

public class CardMain2 {
	public static void main(String[] args) {
		CardDeck cd = new CardDeck();//카드를 담는 통으로 이해
		for(int i=0; i<5; i++) {			
			Card card1 = cd.getOneCard();//cd가 carddeck객체이기 때문에 그 안에 메소드가 있어야
			System.out.println(card1);
		}
		System.out.println("-----------------");
		cd.printAll();
	}
}
