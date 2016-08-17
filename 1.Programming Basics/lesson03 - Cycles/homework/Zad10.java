import java.util.Scanner;

public class Zad10 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		
		if(num < 2){
			System.out.println("The number is NOT prime.");
		}
		else{
			boolean isPrime = true;
			for(int i=2; i <= Math.sqrt(num); ++i){
				if(num % i == 0) isPrime = false;
			}
			if(isPrime){
				System.out.println("The number is prime.");
			}
			else{
				System.out.println("The number is NOT prime.");
			}
		}
		
		
		/*					//Drugo reshenie.
		if(num == 2)		//Dori smyatam, che e malko po-burzo, zashtoto vuv for-a propuskame chetnite.
		{
			System.out.println("The number is prime.");
		}
		
		else if(num < 2 || (num & 1)==0){
			System.out.println("The number is NOT prime.");
		}
		else{
			boolean isPrime = true;
			for(int i=3; i <= Math.sqrt(num); i += 2){
				if(num % i == 0) isPrime = false;
			}
			if(isPrime){
				System.out.println("The number is prime.");
			}
			else{
				System.out.println("The number is NOT prime.");
			}
		}
		*/		
	}

}
