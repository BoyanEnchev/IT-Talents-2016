import java.util.Scanner;

public class Zad13 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter sum = ");
		int sum = sc.nextInt();
		
		if(sum < 2 || sum > 27){
			System.out.println("Invalid input!");
		}
		else{
			for(int i=100; i<999; ++i){
				if((i/100 + (i / 10)%10 + i % 10) == sum){
					System.out.println(i);
				}
			}
		}
	}

}
