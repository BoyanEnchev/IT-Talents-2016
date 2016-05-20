package homework;

import java.util.Scanner;

public class Zad4 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int a = sc.nextInt();
		
		System.out.print("Enter second number: ");
		int b = sc.nextInt();
		
		
		if(a<b){
			System.out.println(a + " " + b);
		}
		else{
			System.out.println(b + " " + a);
		}
	}

}
