import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		System.out.println("verniq otgovor e tova : " + Integer.toBinaryString(x));
		System.out.println("Az poluchavam tova : ");

		long result = 0;
		long powerOf10 = 1;
		byte countOf1 = 0;

		while (x > 0) {
			byte digit = (byte) (x % 2);

			countOf1 += digit;

			result += digit * powerOf10;
			x /= 2;
			powerOf10 *= 10;
		}

		System.out.println(result);
		System.out.println("Broi edinici " + countOf1);
	}
}
