package war;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		System.out.println("Welcome to War card game simulator. Press enter to begin...");
		Scanner kb = new Scanner(System.in);
		kb.nextLine();
		
		int score1 = 0;
		int score2 = 0;
		
		Player player1 = new Player();
		Player player2 = new Player();
		
		Map<String, Integer> p1Hand = player1.getPlayer1Hand();
		Map<String, Integer> p2Hand = player2.getPlayer2Hand();
		
		List<String> p1Key = new ArrayList<>(p1Hand.keySet());
		List<String> p2Key = new ArrayList<>(p2Hand.keySet());
		
		List<Integer> p1Val = new ArrayList<>(p1Hand.values());
		List<Integer> p2Val = new ArrayList<>(p2Hand.values());
		
		for (int i = 0; i <p2Hand.size(); i++) {
			System.err.println("Round = " + (i+1));
			System.out.println("Player 1's card = " + p1Key.get(i));
			System.out.println("Player 2's card = " + p2Key.get(i) + "\n");
			if (p1Val.get(i) > p2Val.get(i)) {
				System.out.println("***Player 1 wins round " + (i+1) +"***");
				player1.setScore(score1+=1);
			} else if (p2Val.get(i) > p1Val.get(i)) {
				System.out.println("***Player 2 wins round " + (i+1) +"***");
				player2.setScore(score2+=1);
			} else {
				System.out.println("***Round "+ (i+1) +  " is draw***");
			}
			System.out.println("\nPlayer 1's score = " + player1.getScore());
			System.out.println("Player 2's score = " + player2.getScore() + "\n");
			
			System.out.println("Press enter to continue...");
			kb.nextLine();
		}
		
		kb.close();
		
		if (player1.getScore() > player2.getScore()) {
			System.err.println(" _______________________");
			System.err.println("|Player 1 Wins the game!|");
			System.err.println("|_______________________|");
		} else if (player2.getScore() > player1.getScore()) {
			System.err.println(" _______________________");
			System.err.println("|Player 2 Wins the game!|");
			System.err.println("|_______________________|");
		} else {
			System.err.println(" _____________________");
			System.err.println("|The game is a Draw...|");
			System.err.println("|_____________________|");
		}
	}
}