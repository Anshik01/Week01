import java.util.Arrays;
import java.util.Scanner;

public class DeckOfCards{
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		String[] initialDeck  = initializeDeck();
		String[] shuffledCard = shuffleCards(initialDeck);
		String[][] distributedCard = distributeCards(shuffledCard, n, x);
		
		printPlayers(distributedCard);
	}
	
	public static void printPlayers(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + "'s cards:");
            for (String card : players[i]) {
                System.out.println(card);
            }
            System.out.println();
        }
    }
	
	public static String[] initializeDeck(){
		// deck of cards with suits "Hearts", "Diamonds", "Clubs", "Spades" and ranks from "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", and "Ace"

		String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
		String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
		
		int numOfCards = suits.length * ranks.length;
		
		String[]deckOfCard = new String[numOfCards];
		
		int idx = 0;
		for(int i=0; i<suits.length; i++){
			for(int j=0; j<ranks.length; j++){
				String temp = ranks[j] + " of " + suits[i];
				deckOfCard[idx] = temp;
				idx++;
			}
		}
		
		return deckOfCard;
	}
	
	public static String[] shuffleCards(String[]deck){
		
		int n = deck.length;
		
		for(int i=0; i<n; i++){
			int randomCardNumber = i + (int) (Math.random() * (n - i));
			String currentCard = deck[i];
			String randomCard = deck[randomCardNumber];
			
			// swap both cards
			String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
		}
		return deck;
	}
	
	public static String[][] distributeCards(String[]deck, int n, int x){
		
		if(n % x != 0){
			throw new IllegalArgumentException("The cards cannot be evenly distributed to the players.");
		}
		
		int cardPerPlayer = n/x;
		
		String[][]player = new String[x][cardPerPlayer];
		
		int index = 0;

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < cardPerPlayer; j++) {
                player[i][j] = deck[index++];
            }
        }

        return player;
	}
}