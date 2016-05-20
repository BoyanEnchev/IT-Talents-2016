import java.util.Scanner;

public class Zad4 {
	public static void main(String[] args) {

		// Task4. Write a program that tells you if a number is prime.//prosto
		// chislo

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean isPrime = true;

		if (num < 2) {
			System.out.println("FALSE!");
		} else {
			for (int i = 2; i < Math.sqrt(num); ++i) {
				if(num % i == 0) isPrime = false;
			}
			if(isPrime) {
				System.out.println("TRUE!");
			}
			else{
				System.out.println("FALSE!");
			}
		}
	}

}
