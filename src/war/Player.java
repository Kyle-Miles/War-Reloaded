package war;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Player {
	private Map<String, Integer> dealDeck = new LinkedHashMap<>();
	
	private Map<String, Integer> player1Hand = new LinkedHashMap<>(); 
	private Map<String, Integer> player2Hand = new LinkedHashMap<>();
	
	private int score;
	
	public Player() { 
	Deck deck = new Deck();
	
	dealDeck.putAll(deck.shuffleDeck());
	
	List <String> keys = new ArrayList<>(dealDeck.keySet());
	List <Integer> values = new ArrayList<>(dealDeck.values());

	int j = 1;
	for (int i = 0; i <dealDeck.size(); i+=2) {
		player1Hand.put(keys.get(i), values.get(i));
		player2Hand.put(keys.get(j), values.get(j));
		j+=2;
		}
	}

	public Map<String, Integer> getPlayer1Hand() {
		return player1Hand;
	}

	public Map<String, Integer> getPlayer2Hand() {
		return player2Hand;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
}