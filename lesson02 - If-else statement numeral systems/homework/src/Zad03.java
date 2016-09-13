package homework;

import java.util.Scanner;

public class Zad3 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a: ");
		int a = sc.nextInt();
		
		System.out.println("Enter b: ");
		int b = sc.nextInt();
		
		System.out.println("Before swap: \n" + "a= " + a + "  b= " + b);
		
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		
		System.out.println("After swap: \n" + "a= " + a + "  b= " + b);
		
		/**
		 * Second way two swap two variables:
		 * a = b + a;
		 * b = a - b;
		 * a = a - b;
		 */
		

	}

}
