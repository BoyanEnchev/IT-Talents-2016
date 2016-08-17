package homework;

import java.util.Scanner;

public class Zad5 {

	public static void main(String[] args) {
	
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int a = sc.nextInt();
		
		System.out.print("Enter second number: ");
		int b = sc.nextInt();
		
		System.out.print("Enter third number: ");
		int c = sc.nextInt();
		
		
		if(a >= b && b >= c){
			System.out.println(a + " " + b + " " +c);
		}
		else if(a >= c && b <= c){
			System.out.println(a + " " + c + " " + b);
		}
		else if(b >= a && a >= c){
			System.out.println(b + " " + a + " " + c);
		}
		else if(b >= c && a <= c){
			System.out.println(b + " " + c + " " + a);
		}
		else if(c >= a && a >= b){
			System.out.println(c + " " + a + " " + b);
		}
		else{
			System.out.println(c + " " + b + " " + a);
		}
	}
}
