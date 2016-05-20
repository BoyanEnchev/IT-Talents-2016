import java.util.Scanner;

public class Zad6 {

	public static void main(String[] args) {
	
		//Task6. Write a program that reads a short positive number and tells how many bits are 1 in it.
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		short num = sc.nextShort();
		int count = 0;
		
		while(num != 0){
			if((num & 1) == 1){
				count++;
			}
			num = (short) (num >> 1);
		}
		System.out.println(count);
	}

}
