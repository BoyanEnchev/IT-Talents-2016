import java.util.Scanner;

public class Zad18 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter two numbers from [1..10]: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for(int i=1; i<=a; ++i){
			for(int j=1; j<=b; ++j){
				System.out.println(i +"*"+j+" ="+(i*j));
			}
		}

	}

}
