import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[][] arr = new int[4][4];

		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				arr[row][col] = sc.nextInt();
			}
		}
		int maxSumRow = Integer.MIN_VALUE;
		int maxSumCol = Integer.MIN_VALUE;

		for (int row = 0; row < 4; row++) {
			int sumRow = 0, sumCol = 0;

			for (int col = 0; col < 4; col++) {
				sumRow += arr[row][col];
				sumCol += arr[col][row];
			}
			if (sumRow > maxSumRow) {
				maxSumRow = sumRow;
			}
			if (sumCol > maxSumCol) {
				maxSumCol = sumCol;
			}
		}

		System.out.println("The biggest sum of rows is: " + maxSumRow);
		System.out.println("The biggest sum of cols is: " + maxSumCol);

		if (maxSumRow > maxSumCol) {
			System.out.println("max sum of rows > max sum of cols");
		} else {
			if (maxSumRow < maxSumCol) {
				System.out.println("max sum of cols > max sum of rows");
			} else {
				System.out.println("the sum are equals");
			}

		}
	}

}
