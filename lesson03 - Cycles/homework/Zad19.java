import java.util.Scanner;

public class Zad19 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number from [10..99]: ");
		int num = sc.nextInt();

		do {
			if ((num & 1) == 0) {
				num /= 2;
			} else {
				num = num * 3 + 1;
			}
			System.out.print(num + " ");
		} while (num != 1);
	}

}
