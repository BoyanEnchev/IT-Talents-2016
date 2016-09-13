package homework;

import java.util.Scanner;

public class zad6 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a: ");
		int a = sc.nextInt();
		
		System.out.println("Enter b: ");
		int b = sc.nextInt();
		
		System.out.println("Enter c: ");
		int c = sc.nextInt();
		
		System.out.println("Before swap:  a= " + a + "  b= " + b + "  c= " + c);
		
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		
		b = b ^ c;
		c = b ^ c;
		b = b ^ c;
		
		System.out.println("After swap:  a= " + a + "  b= " + b + "  c= " + c);
		
	}

}
