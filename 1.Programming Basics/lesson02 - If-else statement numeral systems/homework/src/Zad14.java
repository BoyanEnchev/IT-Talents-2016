package homework;

import java.util.Scanner;

public class Zad14 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter coordinates from [1..8] of First position: \n x1 = ");
		byte x1 = sc.nextByte();		//izpolzvam byte, zashtoto poziciite sa v [1..8]
		System.out.print(" y1 = ");
		byte y1 = sc.nextByte();
		
		System.out.print("Enter coordinates from [1..8] of Second position: \n x2 = ");
		byte x2 = sc.nextByte();
		System.out.print(" y2 = ");
		byte y2 = sc.nextByte();
		
		
		if(x1 < 0 || x2 < 0 || y1 < 0 || y2 < 0 || x1 > 8 || x2 > 8 || y1 > 8 || y2 >8){
			System.out.println("Invalid input!");
		}
		else{
			if( ((x1+y1) & 1) == ((x2+y2) & 1) ){
				System.out.println("Their positions HAVE equal colours.");
			}
			else{
				System.out.println("Their positions HAVE NOT equal colours.");
			}
		}
	}

}
