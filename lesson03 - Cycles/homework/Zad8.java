import java.util.Scanner;

public class Zad8 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int x = n-1;
		
		if(n<1){
			System.out.println("Invalid input!");
		}
		else if(n==1){
			System.out.println(0);
		}
		else{
			for(int row = 0; row < n; ++row){
				for(int col = 0; col < n; ++col){
					System.out.print(x + " ");
				}
				x += 2;
				System.out.println();
			}
		}
	}

}
