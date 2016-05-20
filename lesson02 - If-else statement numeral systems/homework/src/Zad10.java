package homework;

import java.util.Scanner;

public class Zad10 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter litres: ");
		int litres = sc.nextInt();
		
		int count = litres / 5;
		int rem = litres % 5;
		
		if(rem == 0){
			System.out.println(count + " times by 2 litres \n" + count + " times by 3 litres.");
		}
		else if(rem == 1){
			--count;
			System.out.println(count + " times by 2 litres \n" + count + " times by 3 litres,");
			System.out.println("additionally 2 buckets by 3 litres (or 3 bucket by 2 litres).");
		}
		else if(rem == 2){
			System.out.println(count + " times by 2 litres \n" + count + " times by 3 litres,");
			System.out.println("additionally 1 bucket by 2 litres.");
		}
		
		else if(rem == 3){
			System.out.println(count + " times by 2 litres \n" + count + " times by 3 litres,");
			System.out.println("additionally 1 bucket by 3 litres.");
		}
		else{
			System.out.println(count + " times by 2 litres \n" + count + " times by 3 litres,");
			System.out.println("additionally 2 bucket by 2 litres.");
		}

	}

}
