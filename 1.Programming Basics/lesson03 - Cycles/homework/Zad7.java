import java.util.Scanner;

public class Zad7 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter n:");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; ++i){
			System.out.print(3*i + " ");
		}
	}

}
