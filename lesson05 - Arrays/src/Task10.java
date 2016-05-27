import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[7];
		int sum = 0;

		for (int index = 0; index < arr.length; index++) {
			System.out.print("arr[" + index + "] = ");
			arr[index] = sc.nextInt();
			sum += arr[index];
		}

		int avg = sum / 7;
		int nearest = arr[0];

		for (int index = 1; index < arr.length; index++) {
			if (Math.abs(arr[index] - avg) < Math.abs(nearest - avg)) {
				nearest = arr[index];
			}
		}
		System.out.println("The average of numbers is: " + avg + " and the nearest numbers to average is " + nearest);
	}

}
