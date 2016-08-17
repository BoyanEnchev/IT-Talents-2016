import java.util.Scanner;

public class Zad7 {

	public static void main(String[] args) {
		
		//Write a program that reads numbers A, B and C. A must be short. B and C must be < 7. The
		// * program has to invert the bits from number A on positions B and C. Print the new value of A.
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		short a = sc.nextShort();
		short b = sc.nextShort();
		short c = sc.nextShort();
		
		a = (short) (a ^ (1 << b-1));
		a = (short) (a ^ (1 << c-1));
		System.out.println(a);
	}

}
