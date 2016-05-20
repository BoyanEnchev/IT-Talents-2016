import java.util.Scanner;

public class Zad6 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int number = sc.nextInt();
		
		int sum=0;
		
		if(number < 1){
	
			for(int i=number; i<=1; ++i){
				sum += i;
			}
		}
		else{
			
			for(int i=number; i>=1; --i){
				sum += i;
			}
		}
		System.out.println("The sum is: " + sum);
	}

}
