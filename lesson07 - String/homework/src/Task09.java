import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String text = sc.nextLine();
		text = text.replaceAll("[^-?0-9]+", " ");
		
		String[] numbers = text.split(" ");  // purviqt element na masiva e " ".
		
		int sum = 0;
		for (int index = 1; index < numbers.length; index++) {
			System.out.println(numbers[index]);
			sum += Integer.parseInt(numbers[index]);
		}
		
		System.out.println("The sum is: " + sum);
	}

}
