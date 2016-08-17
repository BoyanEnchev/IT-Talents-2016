package homework;

import java.util.Scanner;

public class Zad1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a: ");
		double a = sc.nextDouble();
		
		System.out.println("Enter b: ");
		double b = sc.nextDouble();
		
		System.out.println("Enter c: ");
		double c = sc.nextDouble();
		
		System.out.print("Is c between a and b?  - ");
		System.out.print((a<c) && (c<b));
		
	}

}
