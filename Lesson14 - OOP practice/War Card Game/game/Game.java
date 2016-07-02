package game;

import java.util.Scanner;

public class Game {

	Player player1;
	Player player2;

	Game() {
		this.player1 = new Player();
		this.player2 = new Player();
		startGame(player1, player2);
	}

	public void startGame(Player player1, Player player2) {

		Card[] deck = new Card[52];
		int indexDeck = 0;

		for (int indexSuit = 0; indexSuit <= 3; indexSuit++) {
			for (int indexKind = 0; indexKind <= 12; indexKind++) {
				deck[indexDeck] = new Card(Kind.values()[indexKind], Suit.values()[indexSuit]);
				indexDeck++;
			}
		}

		deck = shuffle(deck); // razmeshvame kartite

		for (int index = 0; index < 52; index++) {
			if (index % 2 == 0) {
				player1.deck.push(deck[index]); // razdavame karti i na dvamata
												// igrachi
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
					System.out
							.println("Player2 wins! Points: " + player1.points.size() + " : " + player2.points.size());
				} else {
					System.out.println("War!!!");
					war(temp1, temp2);
				}
			}
			Scanner sc = new Scanner(System.in);

		}

		if (player1.points.size() > player2.points.size()) {
			System.out.println("Player1 wins!");
		} else {
			System.out.println("Player2 wins");
		}
	}

	public void war(Card temp1, Card temp2) {

		Card temp11 = player1.deck.pop();
		Card temp12 = player1.deck.pop();
		Card temp13 = player1.deck.pop();

		Card temp21 = player2.deck.pop();
		Card temp22 = player2.deck.pop();
		Card temp23 = player2.deck.pop();

		if (temp13.kind.compareTo(temp23.kind) > 0) {
			player1.points.add(temp1);
			player1.points.add(temp11);
			player1.points.add(temp12);
			player1.points.add(temp13);
			player1.points.add(temp2);
			player1.points.add(temp21);
			player1.points.add(temp22);
			player1.points.add(temp23);
			System.out
					.println("Player1 wins the WAR! Points: " + player1.points.size() + " : " + player2.points.size());
		} else {
			if (temp13.kind.compareTo(temp23.kind) < 0) {
				System.out.println("Player2 wins the war!");
				player2.points.add(temp1);
				player2.points.add(temp11);
				player2.points.add(temp12);
				player2.points.add(temp13);
				player1.points.add(temp2);
				player2.points.add(temp21);
				player2.points.add(temp22);
				player2.points.add(temp23);
				System.out.println(
						"Player2 wins the WAR! Points: " + player1.points.size() + " : " + player2.points.size());
			} else {
				Card tempX = temp1;
				Card tempY = temp2;

				while (tempX.kind.compareTo(tempY.kind) == 0) {
					Card tempOne = player1.deck.pop();
					Card tempTwo = player2.deck.pop();

					if (temp1.kind.compareTo(temp2.kind) > 0) {
						player1.points.add(tempOne);
						player1.points.add(tempTwo);
						player1.points.add(temp1);
						player1.points.add(temp11);
						player1.points.add(temp12);
						player1.points.add(temp13);
						player1.points.add(temp2);
						player1.points.add(temp21);
						player1.points.add(temp22);
						player1.points.add(temp23);
						System.out.println("Player1 wins the WAR! Points: " + player1.points.size() + " : "
								+ player2.points.size());
						break;
					} else {
						if (temp1.kind.compareTo(temp2.kind) < 0) {
							player2.points.add(tempOne);
							player2.points.add(tempTwo);
							;
							player2.points.add(temp1);
							player2.points.add(temp11);
							player2.points.add(temp12);
							player2.points.add(temp13);
							player1.points.add(temp2);
							player2.points.add(temp21);
							player2.points.add(temp22);
							player2.points.add(temp23);
							System.out.println("Player2 wins the WAR! Points: " + player1.points.size() + " : "
									+ player2.points.size());
							break;
						} else {
							tempX = tempOne;
							tempY = tempTwo;
						}
					}
				}
			}
		}
	}

}
