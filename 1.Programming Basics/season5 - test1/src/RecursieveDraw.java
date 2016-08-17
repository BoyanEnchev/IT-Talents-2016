
public class RecursieveDraw {
	
	static void paintBrush(char[][] arr, int row, int col){
		
		if(row < 0 || row >= arr.length || col < 0 || col >= arr[arr.length-1].length 
								|| arr[row][col] == 'r' || arr[row][col] == 'b'){
			return;
		}
		arr[row][col] = 'r';
		
		paintBrush(arr, row+1, col);
		paintBrush(arr, row, col+1);
		paintBrush(arr, row-1, col);
		paintBrush(arr, row, col-1);
	}
	
	static void print(char[][] array){
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[array.length-1].length; col++) {
				System.out.print(array[row][col] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		char[][] array = {{'b', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
					   	  {'b', 'b', 'b', 'b', ' ', ' ', 'x', ' ', ' ', ' ', ' ', ' '},
					   	  {' ', ' ', ' ', 'b', 'b', ' ', ' ', ' ', ' ', 'b', 'b', 'b'},
					   	  {' ', ' ', ' ', ' ', 'b', 'b', ' ', ' ', 'b', 'b', ' ', ' '},
					   	  {' ', ' ', ' ', ' ', ' ', 'b', 'b', 'b', 'b', ' ', ' ', ' '}};
		
		print(array);
		System.out.println();
		
		paintBrush(array, 1,7);
		print(array);
	}
}
