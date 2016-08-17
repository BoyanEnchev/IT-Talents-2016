import java.util.Scanner;

public class HeadTail {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int count = 0;

		while (count < 5) {
			System.out.println("Enter 1 from 'Head' or 2 from 'Tail'");
			byte choice = sc.nextByte();
			switch (choice) {
			case 1:
				System.out.println("Head!");
				count++;
				break;
			case 2:
				System.out.println("Tail!");
				count = 0;
				break;
			default:
				System.out.println("Invalid input!");
			}

		}
	}
}
