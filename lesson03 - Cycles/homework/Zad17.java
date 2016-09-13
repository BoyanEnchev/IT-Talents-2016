import java.util.Scanner;

public class Zad17 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number from [3..20] and sign: ");
		int b = sc.nextInt();
		char sign = sc.next().charAt(0);
		
		if (b < 3 || b > 20) {
			System.out.println("Invalid input!");
		} else {

			for (int i = 1; i <= b; ++i) {
				for (int j = 1; j <= b; ++j) {
					if (i == 1 || i == b || j == 1 || j == b) {
						System.out.print("*");
					} else {
						System.out.print(sign);
					}
				}
				System.out.println();
			}
		}
	}

}
