import java.util.Scanner;

public class Zad25 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number: ");
		int num = sc.nextInt();
		int fact = 1;

		if (num < 0) {
			System.out.println("Invalid input!");
		} else {

			do {
				if (num == 0) {
					fact = 1;
					break;
				}
				fact *= num;
				num--;
			} while (num > 0);
			System.out.println(fact);
		}
	}
}
