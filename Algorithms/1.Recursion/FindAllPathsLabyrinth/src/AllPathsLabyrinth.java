
public class AllPathsLabyrinth {
	
	static char[] path = new char[100];
	static int countSteps = -1;
	
	private static void FindPaths(char[][] maze, boolean[][] visited, int row, int col){
		
		if ( (row <0) || (col<0) || (row > maze.length) || (col > maze[row].length) 
								 || (Character.valueOf(maze[row][col]).equals(Character.valueOf('*'))) || (visited[row][col])) {
			countSteps--;
			return;
			}	
		if(Character.valueOf(maze[row][col]).equals(Character.valueOf('e'))){
			printPath(path);
			countSteps--;
			return;
		}
		
		countSteps++;
		visited[row][col] = true;
		
		path[countSteps] = 'D';
		FindPaths(maze, visited, row+1, col);
		
		path[countSteps] = 'R';
		FindPaths(maze,visited, row, col+1);
		
		path[countSteps] = 'U';
		FindPaths(maze, visited, row-1, col);
		
		path[countSteps] = 'L';
		FindPaths(maze, visited, row, col-1);
		
		visited[row][col] = false;
		
	}
	
	
	
	
	private static void printPath(char[] path){
		for(int i=0; i<path.length; ++i) System.out.println(path[i]);
	}

	public static void main(String[] args) {
		char[][] maze = {{'s', ' ' ,' ', ' '},
						 {' ', '*', '*', ' '},
						 {' ', '*', '*', ' '},
						 {' ', '*', 'e', ' '},
						 {' ', ' ', ' ', ' '}};
		
		boolean[][] visited = new boolean[4][4];
		
		FindPaths(maze, visited, 0, 0);
	}

}
