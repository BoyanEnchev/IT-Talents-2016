import java.util.Scanner;

public class Zad5 {

	public static void main(String[] args) {
		//  * Task5. Write a program that reads a positive number and writes its binary representation.
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong(); 
		
		int count = (int) (Math.log(num) / Math.log(2));
		
		/*while(num != 0){
			tempNum += (int) ((num & 1) * Math.pow(10, count++));
			num = num >> 1;
		}
		System.out.println(tempNum);*/
		
		
		
		while(count != -1){
			System.out.print((num >> count) & 1 );
			count--;
		}
	}

}
