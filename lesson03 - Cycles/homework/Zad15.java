import java.util.Scanner;

public class Zad15 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter num = ");
		int num = sc.nextInt();
		int sum = 0;
		
		do{
			sum += num;
			num--;
		}while(num>=1);
		
		System.out.println(sum);
	}

}
