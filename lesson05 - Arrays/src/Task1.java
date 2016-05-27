import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int min = Integer.MAX_VALUE;

		for (int index = 0; index < arr.length; index++) {
			arr[index] = sc.nextInt();

			if (arr[index] % 3 == 0 && arr[index] < min) {
				min = arr[index];
			}
		}

		if (min != Integer.MAX_VALUE) {
			System.out.println("The lowest number that can be devided by 3 is: " + min);
		} else {
			System.out.println("In the array has not number that can be devided by 3.");
		}

	}

}
