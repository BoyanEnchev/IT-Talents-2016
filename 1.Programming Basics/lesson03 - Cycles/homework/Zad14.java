import java.util.Scanner;

public class Zad14 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter num = ");
		int num = sc.nextInt();
		
		if(num < 10 || num > 200){
			System.out.println("Invalid input!");
		}
		else{
			while(num >= 10){
				if(num % 7 == 0){
					System.out.println(num);
				}
				--num;
			}
		}

	}

}
