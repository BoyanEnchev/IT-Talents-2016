
public class Task3 {

	public static void main(String[] args) {
		
		int[][] arr = { { 1, 2, 3, 4, 5 },
						{ 6, 7, 8, 9, 10},
						{ 11, 12, 13, 14, 15},
						{16, 17, 18, 19, 20}};
								
		int sum = 0;
		int count = 0;
		
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				sum += arr[row][col];
				count++;
			}
		}
		
		double halfAr = (sum/(double)count);
				
		System.out.println("The sum of elements in matrix is: " + sum);
		System.out.println("The half-arithmetic of elements is: " + halfAr);
	}

}
