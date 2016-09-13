import java.util.Scanner;

public class Zad24 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number from [10..30000]: ");
		int num = sc.nextInt();
		int tempNum = num, count = 0;

		if (num < 10 || num > 30000) {
			System.out.println("Invalid input!");
		} else {
			while (tempNum > 0) {
				count++;
				tempNum /= 10;
			}

			do {
				if ((num / (int) (Math.pow(10, count - 1))) != num % 10) {
					System.out.println("NO!");
					break;
				}
				num = (int) ((num % (Math.pow(10, count - 1))) / 10);
				count -= 2;
			} while (num > 9);

			if (num < 10) {
				System.out.println("YES!");
			}
		}
	}

}
