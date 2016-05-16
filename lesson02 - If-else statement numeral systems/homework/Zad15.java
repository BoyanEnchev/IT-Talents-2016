package homework;

import java.util.Scanner;

public class Zad15 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number from interval [0..24]:");
		byte hour = sc.nextByte();	
		
		if(hour < 0 || hour > 24){
			System.out.println("Invalid input!");
		}
		else{
			if(hour >= 4 && hour <= 9){
				System.out.println("Good moorning!");
			}
			else if(hour > 9 && hour < 18){
				System.out.println("Good afternoon!");
			}
			else{
				System.out.println("Good evening!");
			}
		}
	}

}
