package sec06.ch06.blackjack;

public class CardDeck {
	public final static String[] CARD_PATTERNS = { "Spades", "Hearts", "Diamonds", "Clubs" };
	private final int EACH_CARD_LEN = 13;
	private final Card[] CARD_ARR;// 은닉화 private, 상수 final 52개의 카드 객체를 담을 수 있는 [52], 전역 배열
	// final은 한번 들어가면 주소 값을 바꿀 수 없음
	// 생성자 안에서 값울 주기 때문에 잠깐 위에서 생략 가능

	public CardDeck() { // class에 public을 붙였으먄 생성자도 public 줄 것, 안넣으면 다른 패키지에서 클래스는 접근 가능하지만 생성자는 접근 불가능
		CARD_ARR = new Card[CARD_PATTERNS.length * EACH_CARD_LEN];// 52칸의 카드 객체 배열
		init();
	}
//		private void init2(){
//		int z = 0;
//		for (String pattern : CARD_PATTERNS) {
//			for (String symbol : CARD_SYMBOLS) {
//				CARD_ARR[z++] = new Card(pattern, symbol);
//			}
//		}
//		}

	private void init() {
		int idx = 0;
		for (int i = 0; i < CARD_PATTERNS.length; i++) {
			for (int z = 1; z <= EACH_CARD_LEN; z++) {
				String symbol = null;
				switch (z) {
				case 1:
					symbol = "A";
					break;
				case 11:
					symbol = "J";
					break;
				case 12:
					symbol = "Q";
					break;
				case 13:
					symbol = "K";
					break;
				// default: symbol = Integer.toString(z);
				default:
					symbol = String.valueOf(z);
				}
				CARD_ARR[idx++] = new Card(CARD_PATTERNS[i], symbol);
				// CARD_ARR[(i*EACH_CARD_LEN) + (z-1)] = new Card(CARD_PATTERNS[i], symbol);
				// 퍼포먼스상 불리
			}
		}
	}

	public Card getOneCard() {// random하게 하나를 뽑은 후 주소 값을 리턴하고 값을 null로 설정
		int i;
		do {
			i = (int) (Math.random() * (CARD_ARR.length));
		} while (CARD_ARR[i] == null);
		
		Card R = CARD_ARR[i];
		CARD_ARR[i] = null;
		return R;
	}
	
	public void printAll() {
		for(Card c : CARD_ARR) {
			System.out.println(c);
		}
	}

}
