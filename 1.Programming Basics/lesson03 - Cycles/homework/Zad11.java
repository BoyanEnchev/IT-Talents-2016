import java.util.Scanner;

public class Zad11 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter n = ");
		int n = sc.nextInt();
		
		for(int i=1, p=n-1; i<=n; i++, p--){		//Standard triangle
			for(int j = p; j > 0; j--){
				System.out.print(" ");
			}
			for(int j=1; j<=i*2-1; ++j){
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		for(int i=1, p=n-1; i<=n; i++, p--){		//Empty triangle 
			for(int j = p; j > 0; j--){
				System.out.print(" ");
			}
			
			for(int j=1; j<=i*2-1; ++j){
				
				if(i==n){
					System.out.print("*");
				}
				
				else if(j==1 || j==i){
				System.out.print("* ");
				}
			
				else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
