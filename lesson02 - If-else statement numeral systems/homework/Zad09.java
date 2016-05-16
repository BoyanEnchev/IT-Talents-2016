package homework;

import java.util.Scanner;

public class Zad9 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a from [10..99] :");
		int a = sc.nextInt();
		
		System.out.println("Enter b from [10..99] :");
		int b = sc.nextInt();
		
		int c = a * b;
		System.out.print(c + " " + (c%10));
		
		if((c & 1) == 0){
			System.out.println(" even");
		}
		else{
			System.out.println(" odd");
		}
		
		
		
		

	}

}
