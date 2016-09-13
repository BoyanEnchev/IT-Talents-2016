import java.util.Scanner;

public class Zad22 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number from [10..30000]: ");
		int num = sc.nextInt();
		int count = 0;

		while (count < 10) {
			num++;
			if (((num & 1) == 0) || (num % 3 == 0) || (num % 5 == 0)) {
				count++;
				System.out.print(count + ":" + num + "  ");
			}
		}

	}

}
