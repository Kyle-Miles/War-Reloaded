package war;

public enum Suit {
	
	CLUBS("Clubs"), DIAMONDS("Diamonds"), HEARTS("Hearts"), SPADES("Spades");
	
	private String suitValue;

	Suit(String suitValue) {
		this.suitValue = suitValue;
	} 
	
	public String getSuitValue() {
		return suitValue;
	}
}