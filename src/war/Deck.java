package war;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Deck {
	
	private Map <String, Integer> deckMap = new LinkedHashMap<>();
	private Map <String, Integer>  randomDeck = new LinkedHashMap<>();
	
	public Deck() {
		buildDeck();
		shuffleDeck();
	}

	public Map<String, Integer> buildDeck() {
		
		for (Card card : Card.values()) {
			deckMap.put(card.getCardName() 
				+ " of " 
				+ Suit.CLUBS.getSuitValue(), 
				card.getCardValue());	
		}
		for (Card card : Card.values()) {
			deckMap.put(card.getCardName() 
				+ " of " 
				+ Suit.DIAMONDS.getSuitValue(), 
				card.getCardValue());	
		}
		for (Card card : Card.values()) {
			deckMap.put(card.getCardName() 
				+ " of " 
				+ Suit.HEARTS.getSuitValue(), 
				card.getCardValue());	
		}
		for (Card card : Card.values()) {
			deckMap.put(card.getCardName() 
				+ " of " 
				+ Suit.SPADES.getSuitValue(), 
				card.getCardValue());	
		}
	
		return deckMap;
	}
	
	public Map<String, Integer> shuffleDeck() {
		List<Map.Entry<String, Integer>> entries = new ArrayList<>(deckMap.entrySet());
		
		Collections.shuffle(entries, new SecureRandom());
		
		for (Map.Entry<String, Integer> entry : entries) {
		randomDeck.put(entry.getKey(), entry.getValue());
		}
			
		return randomDeck;
	}
}