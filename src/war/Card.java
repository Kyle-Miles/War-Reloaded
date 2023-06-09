package war;

public enum Card {
	
	TWO("Two", 2), THREE("Three", 3), FOUR("Four", 4), 
	FIVE("Five", 5), SIX("Six", 6), SEVEN("Seven", 7), 
	EIGHT("Eight", 8), NINE("Nine", 9), TEN("Ten", 10), 
	JACK("Jack", 11), QUEEN("Queen", 12), KING("King", 13), ACE("Ace", 14);
	
	private String cardName;
	private int cardValue;

	Card(String cardName, int cardValue) {
		this.cardName = cardName;
		this.cardValue = cardValue;
	} 
	
	public String getCardName() {
		return cardName;
	}
	
	public int getCardValue() {
		return cardValue;
	}
}