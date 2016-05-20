import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
//		int min = (a<b) ? a : b;
//		int max = (a>b) ? a : b;
		
		if (a > b) {
			int temporary = a;
			a = b;
			b = temporary;
		}
		
		for (int num = a; num <= b; num++) {
			if (num % 3 == 0) {
				System.out.println(num);
			}
		}
	}
}
