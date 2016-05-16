package homework;

import java.util.Scanner;

public class Zad2 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a: ");
		int a = sc.nextInt();
		
		System.out.println("Enter b: ");
		int b = sc.nextInt();
		
		int sum = a + b;
		int deduction = a - b;
		int product = a * b;
		int divWithRem = a % b;
		int div = a / b;
		
		System.out.println("The sum of a and b is: " + sum);
		System.out.println("The deduction of a and b is: " + deduction);
		System.out.println("The product of a and b is: " + product);
		System.out.println("The division with remainder of a and b is: " + divWithRem);
		System.out.println("The division of a and b is: " + div);
		
		/*
		double sum = a + b;
		double deduction = a - b;
		double product = a * b;
		double divWithRem = a % b;
		double div = a / b;
		
		System.out.println("The sum of a and b is: " + sum);
		System.out.println("The deduction of a and b is: " + deduction);
		System.out.println("The product of a and b is: " + product);
		System.out.println("The division with remainder of a and b is: " + divWithRem);
		System.out.println("The division of a and b is: " + div);
		 */
	}

}
