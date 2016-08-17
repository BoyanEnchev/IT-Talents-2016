
public class Task4 {
	public static void main(String[] args){
		
		int[][] arr = { {1,2,3,4},
						{5,6,7,8},
						{9,10,11,12},
						{13,14,15,16} };
		
		for (int row = 0; row < arr.length; row++) {
			for (int col = arr[row].length-1; col >= 0; col--) {
				System.out.print(arr[col][row] + " ");
			}
			System.out.println();
		}
	}

}
