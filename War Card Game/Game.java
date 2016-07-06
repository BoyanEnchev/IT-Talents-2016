package game;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {

	Player player1;
	Player player2;

	Game() {
		this.player1 = new Player();
		this.player2 = new Player();
		startGame();
	}

	public void startGame() {

		Card[] deck = new Card[52];
		int indexDeck = 0;

		for (int indexSuit = 0; indexSuit <= 3; indexSuit++) {
			for (int indexKind = 0; indexKind <= 12; indexKind++) {
				deck[indexDeck] = new Card(Kind.values()[indexKind], Suit.values()[indexSuit]);
				indexDeck++;
			}
		}

		deck = shuffle(deck); 

		for (int index = 0; index < 52; index++) {
			if (index % 2 == 0) {
				player1.deck.push(deck[index]); 
			} else {
				player2.deck.push(deck[index]);
			}
		}

	}

	public Card[] shuffle(Card[] deck) {
		for (int i = 0; i < 500; i++) {
			int random1 = (int) (Math.random() * 52);
			int random2 = (int) (Math.random() * 52);

			Card temp = deck[random1];
			deck[random1] = deck[random2];
			deck[random2] = temp;
		}
		return deck;
	}

	public void play() {

		while (!player1.deck.isEmpty()) {

			Card temp1 = player1.deck.pop();
			Card temp2 = player2.deck.pop();

			System.out.print("player1: " + temp1.kind.name() + " " + temp1.suit.name() + "      " + "player2: "
					+ temp2.kind.name() + " " + temp2.suit.name() + "\n");

			if (temp1.kind.compareTo(temp2.kind) > 0) {
				player1.points.add(temp1);
				player1.points.add(temp2);
				System.out.println("Player1 wins! Points: " + player1.points.size() + " : " + player2.points.size());
			} else {
				if (temp1.kind.compareTo(temp2.kind) < 0) {
					player2.points.add(temp1);
					player2.points.add(temp2);
					System.out.println("Player2 wins! Points: " + player1.points.size() + " : " + player2.points.size());
				} else {
					System.out.println("War!!!");

					ArrayList<Card> tempList1 = new ArrayList<Card>();
					ArrayList<Card> tempList2 = new ArrayList<Card>();
					tempList1.add(temp1);
					tempList2.add(temp2);

					war(tempList1, tempList2);
				}
			}
		}
		checkForWinner();
	}

	public void war(ArrayList<Card> listOfWarCards1, ArrayList<Card> listOfWarCards2) {

		for (int index = 0; index < 3; index++) {
			if (this.player1.deck.isEmpty()) {
				System.out.println("Svyrshi testeto!");
				return;
			}
			listOfWarCards1.add(player1.deck.pop());
			listOfWarCards2.add(player2.deck.pop());
		}

		int lastIndex = listOfWarCards2.size() - 1;

		if (listOfWarCards1.get(lastIndex).kind.compareTo(listOfWarCards2.get(lastIndex).kind) > 0) {
			for (int index = 0; index < listOfWarCards1.size(); index++) {
				player1.points.add(listOfWarCards1.get(index));
				player1.points.add(listOfWarCards2.get(index));
			}
			System.out.println("Result after war: " + player1.points.size() + " : " + player2.points.size());
			return;
		} else if (listOfWarCards1.get(lastIndex).kind.compareTo(listOfWarCards2.get(lastIndex).kind) < 0) {
			for (int index = 0; index < listOfWarCards1.size(); index++) {
				player2.points.add(listOfWarCards1.get(index));
				player2.points.add(listOfWarCards2.get(index));
			}
			System.out.println("Result after war: " + player1.points.size() + " : " + player2.points.size());
			return;
		} else {
			System.out.println("WAR AGAIN !");
			war(listOfWarCards1, listOfWarCards2);
		}
	}

	
	
	
	
	
	void checkForWinner() {
		if (player1.points.size() > player2.points.size()) {
			System.out.println("Player1 win the game!!");
		} else {
			if (player1.points.size() < player2.points.size()) {
				System.out.println("Player2 win the game!!");
			} else {
				System.out.println("No winner!! The results are equal!");
			}
		}
	}

}
