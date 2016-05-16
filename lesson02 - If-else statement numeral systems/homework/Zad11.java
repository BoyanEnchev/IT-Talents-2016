package homework;

import java.util.Scanner;

public class Zad11 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number from [100..999] with zeros in digits: ");
		int num = sc.nextInt();
		
		
		if(num/100 == 0 || (num/10) % 10 == 0 || num % 10 == 0){
			System.out.println("Invalid input! \nWe cannot divide by zero.");
		}
		
		else{
			if((num % (num/100) == 0) && (num % ((num/10) % 10) == 0) && (num % (num%10) == 0)){
				System.out.println("YES! The number can be divided by each of its digits.");
			}
			else{
				System.out.println("NO! The number cannot be divided by each of its digits.");
			}
		}
		
	}

}
