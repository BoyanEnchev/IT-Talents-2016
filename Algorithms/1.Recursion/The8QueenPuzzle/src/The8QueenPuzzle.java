import java.util.HashSet;

public class The8QueenPuzzle {
	
	static boolean[][] chessBoard = new boolean[8][8];     //8x8 fields that we can put the queens
	static int[][] coordArr = new int[8][2];				// We can save the right coordinates in array, and print them
	
	static HashSet<Integer> markedRows = new HashSet<Integer>();
	static HashSet<Integer> markedCols = new HashSet<Integer>();
	static HashSet<Integer> markedLeftDiag = new HashSet<Integer>();
	static HashSet<Integer> markedRightDiag = new HashSet<Integer>();
	
	private static int counter = 0;

	private static void putQueen(int row){
		
		if(row == 8){
			counter++;
			System.out.println("This is the " + counter+ " combination:  ");
			print(coordArr);
			System.out.println();
		}
		else{
			
			for(int col=0; col<8; ++col){
				if(canBePlaced(row,col)){
					
					mark(row,col);
					coordArr[row][0] = row;
					coordArr[row][1] = col;
					
					putQueen(row+1);
					unmark(row,col);
				}
			}	
		}	
	}
	
	
	private static boolean canBePlaced(int row, int col){
		return !( markedRows.contains(row) || markedCols.contains(col) || markedLeftDiag.contains(row-col) || markedRightDiag.contains(row+col));
	}
	
	private static void mark(int row, int col){
		markedRows.add(row);
		markedCols.add(col);
		markedLeftDiag.add(row-col);
		markedRightDiag.add(row+col);
	}
	private static void unmark(int row, int col){
		markedRows.remove(row);
		markedCols.remove(col);
		markedLeftDiag.remove(row-col);
		markedRightDiag.remove(row+col);
	}
	
	private static void print(int[][] arr){
		for(int i=0; i<arr.length; ++i){
			for(int j=0; j<arr[i].length; ++j){
				System.out.print(arr[i][j]);
			} 
			System.out.print(" ");
		}
	}
	
	public static void main(String[] args) {
	
		
		putQueen(0);
	}

}
