
public class Task7 {

	public static void main(String[] args) {

		int[][] arr = { { 11, 12, 13, 14, 15, 16 }, 
						{ 21, 22, 23, 24, 25, 26 },
						{ 31, 32, 33, 34, 35, 36 },
						{ 41, 42, 43, 44, 45, 46 },
						{ 51, 52, 53, 54, 55, 56 },
						{ 61, 62, 63, 64, 65, 66 } };

		int row = 0, col = 0, sum = 0, sumRow = 0;

		while (row < 6) {

			if ((row + col) % 2 == 0) {
				System.out.print(arr[row][col] + " ");
				sumRow += arr[row][col];
			}
			
			if (col == 5) {
				System.out.print(" sum: " + sumRow);
				System.out.println();

				row++;
				col = 0;
				sum += sumRow;
				sumRow = 0;
			} else {
				col++;
			}
		}
		System.out.println("The sum of elements: " + sum);
	}

}
