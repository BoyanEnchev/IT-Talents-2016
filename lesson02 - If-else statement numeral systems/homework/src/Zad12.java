package homework;

import java.util.Scanner;

public class Zad12 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter day: ");
		byte day = sc.nextByte();				
		System.out.print("Enter month: ");      
		byte month = sc.nextByte();
		System.out.print("Enter year: ");
		int year = sc.nextInt();
		
		boolean valid = true;
			
		if(day < 0 || year < 0 || month < 0 || month > 12){
			System.out.println("Invalid input!");
			valid = false;
		}
		
		else if(month == 2){
			if((year % 4 == 0 || year % 400 == 0) && year % 100 != 0){           //Check by leap-year
				
				if(day > 29) {
					System.out.println("Invalid input!");
					valid = false;
				}
				else if (day == 29){
					day = 1;
					++month;
				}
				else{
					++day;
				}
			}
			else{
				if(day > 28) {
					System.out.println("Invalid input!");
					valid = false;
				}
				else if (day == 28){
					day = 1;
					++month;
				}
				else{
					++day;
				}
			}
		}
		
		else if(month == 12){
			if(day > 31){
				System.out.println("Invalid input!");
				valid = false;
			}
			else if(day == 31){
				day = 1;
				month = 1;
				++year;
				System.out.println("Happy New " + year + " Year !");
			}
			else{
				++day;
			}
		}	
			
		else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10){
			if(day > 31){
				System.out.println("Invalid input!");
				valid = false;
			}
			else if(day == 31){
				day = 1;
				++month;
			}
			else{
				++day;
			}
		}
		
		else {
			if(day > 30){
				System.out.println("Invalid input!");
				valid = false;
			}
			else if(day == 30){
				day = 1;
				++month;
			}
			else{
				++day;
			}
		}
		
		
		if(valid){
		System.out.println("Tomorrow will be: " + day + ". "+ month + ". " + year + ".");
		}
	}	
}

