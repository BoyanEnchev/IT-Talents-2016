import java.util.Scanner;

public class Zad5 {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number");
		int first = sc.nextInt();
		System.out.println("Enter first number");
		int second = sc.nextInt();
		
		if(first < second){
			for(int i=first; i<=second; ++i){
				System.out.print(i + " ");
			}
		}
		else{
			for(int i=second; i<=first; ++i){
				System.out.print(i + " ");
			}
		}
	}
}
