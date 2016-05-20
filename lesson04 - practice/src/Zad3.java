import java.util.Scanner;

public class Zad3 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a < b) {
			for (int i = a; i <= b; ++i) {
				if (i % 3 == 0) {
					System.out.println(i + " ");
				}
			}
		} else {
			for (int i = b; i <= a; ++i) {
				if (i % 3 == 0) {
					System.out.println(i + " ");
				}
			}
		}

	}

}
