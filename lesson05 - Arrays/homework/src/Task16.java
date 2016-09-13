import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {

		double[] arr = { -1.12, -2.43, 3.1, 4.2, 0, 6.4, -7.5, 8.6, 9.1, -4 };

		for (int index = 0; index < arr.length; index++) {
			System.out.print(arr[index] + " ");
		}

		for (int index = 0; index < arr.length; index++) {
			if (arr[index] < -0.231) {
				arr[index] = (index+1) * (index+1) + 41.25;
			} else {
				arr[index] = arr[index] * (index+1);
			}
		}

		System.out.println();

		for (int index = 0; index < arr.length; index++) {
			System.out.printf("%.2f", arr[index]);
			System.out.print(" ");
		}

	}

}
