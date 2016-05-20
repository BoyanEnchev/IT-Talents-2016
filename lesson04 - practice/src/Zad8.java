import java.util.Scanner;

public class Zad8 {

	public static void main(String[] args) {
		// * Task8. Write a program that reads a number and prints a triangle of stars with the height of * the number.
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); 
		
		int temp = num;
		
		for(int i = 1; i <= num; ++i){
			
			for(int j = temp-1; j > 0; j-- ){
				System.out.print(" ");
			}
			for(int p=1; p<=i*2 -1; p++){
				
				System.out.print("*");
			}
			System.out.println();
			temp--;
		}

	}

}
