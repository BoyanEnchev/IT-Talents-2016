package homework;

import java.util.Scanner;

public class Zad13 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter temperature from interval [-100..100] :");
		int temp = sc.nextInt();
		
		
		if(temp <= -20){
			System.out.println("Ice-coldly");
		}
		else if(temp > -20 && temp < 0){
			System.out.println("Coldly");
		}
		else if(temp > 0 && temp < 15){
			System.out.println("Coolly");
		}
		else if(temp > 15 && temp < 25){
			System.out.println("Warmly");
		}
		else{
			System.out.println("Heartily");
		}
	}

}
