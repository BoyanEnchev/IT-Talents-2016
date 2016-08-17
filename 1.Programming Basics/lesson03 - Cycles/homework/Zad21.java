
import java.util.Scanner;

public class Zad21 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of card: ");
		int n = sc.nextInt();
		if (n < 0) {
			System.out.println("No such card exsist");
		} else {
			for (int i = 1; i <= 52; i++) {
				if (i < n && i >= 1) {
					continue;
				}
				switch ((i - 1) / 4) {
				case 0:
					System.out.print("Two");
					break;
				case 1:
					System.out.print("Three");
					break;
				case 2:
					System.out.print("Four");
					break;
				case 3:
					System.out.print("Five");
					break;
				case 4:
					System.out.print("Six");
					break;
				case 5:
					System.out.print("Seven");
					break;
				case 6:
					System.out.print("Eight");
					break;
				case 7:
					System.out.print("Nine");
					break;
				case 8:
					System.out.print("Ten");
					break;
				case 9:
					System.out.print("Jack");
					break;
				case 10:
					System.out.print("Queen");
					break;
				case 11:
					System.out.print("King");
					break;
				case 12:
					System.out.print("Ace");
					break;
				default:
					System.out.println("No such card exists.");
					break;
				}
				switch (i / 4) {
				case 0:
				case 1:
				case 2:
				case 3:
				case 4:
				case 5:
				case 6:
				case 7:
				case 8:
				case 9:
				case 10:
				case 11:
				case 12:
				case 13:
					switch (i % 4) {
					case 0:
						System.out.print(" of Spades, ");
						break;
					case 1:
						System.out.print(" of Clubs, ");
						break;
					case 2:
						System.out.print(" of Diamonds, ");
						break;
					case 3:
						System.out.print(" of Hearts, ");
						break;
					default:
						System.out.println("No such card exists.");
						break;
					}
					break;
				default:
					System.out.println("No such card exists.");
					break;
				}

			}
		}

	}
}
