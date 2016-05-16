package homework;

import java.util.Scanner;

public class Zad16 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number from interval [100..999]:");
		int num = sc.nextInt();
		int a = num/100;
		int b = (num/10) % 10;
		int c = num % 10;
		
		if(num < 100 || num > 999){
			System.out.println("Invalid input!");
		}
		else{
			
			if( a == b && b == c){
				System.out.println("The digits are equal. (a=b=c)");
			}
			else if( a > b && b > c){
				System.out.println("The digits are in ascending row. (a>b>c)");
			}
			else if( a < b && b < c){
				System.out.println("The digits are in descending row. (a<b<c)");
			}
			else{
				System.out.println("The digits are not ordered.");
			}
		}
	}

}
