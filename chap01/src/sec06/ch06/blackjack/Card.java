package sec06.ch06.blackjack;

public class Card {
	// 카드패턴 문자열 값을 저장할 수 있는 pattern 멤버필드 존재
	private String pattern;// 멤버 필드 은닉화
	// 카드심볼 문자열 값을 저장할 수 있는 symbol 멤버필드 존재
	private String symbol;

	public Card(String pattern, String symbol) {// 기본 생성자 빼고는 overloaded된 생성자라고 함,
		// class가 public이면 생성자도 public
		// return type 없고 class와 이름 동일
		this.pattern = pattern;
		this.symbol = symbol;
	}

	//
	public String getPattern() {
		return this.pattern;// this 써줘도 되고 안써줘도 됨
	}

	public String getSymbol() {
		return symbol;
	}

	@Override
	public String toString() {
		return String.format("%s (%s)", pattern, symbol);
	}
}