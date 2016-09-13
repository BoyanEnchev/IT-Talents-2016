
public class Task6 {

	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3, 4 }, 
						{ 5, 6, 7, 8 },
						{ 9, 10, 11, 12 }, 
						{ 13, 14, 15, 16 } };

		for (int row = 0; row < arr.length; row++) {
			int sum = 0;
			for (int col = 0; col < arr[row].length; col++) {
				if(row % 2 == 0){
					break;
				}
				sum += arr[row][col];
				System.out.print(arr[row][col] + " ");
			}
			if(row % 2 == 1){
				System.out.print(" sum: " + sum);
				System.out.println();
			}
		}
	}

}
