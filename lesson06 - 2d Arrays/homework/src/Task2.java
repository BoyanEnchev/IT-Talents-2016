import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows and cols in the matrix:");
		int size = sc.nextInt();

		int[][] arr = new int[size][size];

		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				arr[row][col] = sc.nextInt();
			}
		}
		System.out.println("Diagonals:");

		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr.length; col++) {
				if (row == col) {
					System.out.print(arr[row][col] + " ");
				}
			}
		}
		System.out.println();

		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr.length; col++) {
				if (Math.abs(col + row) == size - 1) {
					System.out.print(arr[row][col] + " ");
				}
			}
		}

	}

}
