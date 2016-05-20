import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		boolean isPrime = true;
		for (int num=2; num*num < x; num++) {
			if ( x % num == 0) {
				isPrime = false;
				break;
			}
		}
		
		System.out.println(isPrime ? "Prosto e" : "Ne e prosto");
	}
}
