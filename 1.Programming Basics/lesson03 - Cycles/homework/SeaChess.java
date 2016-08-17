import java.util.Scanner;

public class SeaChess {

	public static void main(String[] args) {
		char[][] arr = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };
		
		Scanner player1 = new Scanner(System.in);
		Scanner player2 = new Scanner(System.in);
		
		boolean win = false;
		int count = 0;
		
		while (!win) {
			
			System.out.print("Player 1 enter i1 = ");
			int i1 = player1.nextInt();
			System.out.print("Player 1 enter j1 = ");
			int j1 = player2.nextInt();
			arr[i1][j1] = 'X';
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					System.out.print("|" + arr[i][j]);
				}
				System.out.print('|');
				System.out.println();
				System.out.println("-------");
			}
			
			if ((arr[0][0] == 'X' && arr[0][1] == 'X' && arr[0][2] == 'X')
					|| (arr[0][0] == 'X' && arr[1][1] == 'X' && arr[2][2] == 'X')
					|| (arr[0][0] == 'X' && arr[1][0] == 'X' && arr[2][0] == 'X')
					|| (arr[0][1] == 'X' && arr[1][1] == 'X' && arr[2][1] == 'X')
					|| (arr[0][2] == 'X' && arr[1][2] == 'X' && arr[2][2] == 'X')
					|| (arr[0][2] == 'X' && arr[1][1] == 'X' && arr[2][0] == 'X')
					|| (arr[1][0] == 'X' && arr[1][1] == 'X' && arr[1][2] == 'X')
					|| (arr[2][0] == 'X' && arr[2][1] == 'X' && arr[2][2] == 'X')) {
				System.out.println("Player 1 wins!");
				win = true;
				break;
			}
			
			++count;
			if (count == 5){
				System.out.println("No Winner!");
				break;
			}
			
			System.out.print("Player 2 enter i2 = ");
			int i2 = player1.nextInt();
			System.out.print("Player 2 enter j2 = ");
			int j2 = player2.nextInt();
			arr[i2][j2] = 'O';
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					System.out.print("|" + arr[i][j]);
				}
				System.out.print('|');
				System.out.println();
				System.out.println("-------");
			}
			
			if ((arr[0][0] == 'O' && arr[0][1] == 'O' && arr[0][2] == 'O')
					|| (arr[0][0] == 'O' && arr[1][1] == 'O' && arr[2][2] == 'O')
					|| (arr[0][0] == 'O' && arr[1][0] == 'O' && arr[2][0] == 'O')
					|| (arr[0][1] == 'O' && arr[1][1] == 'O' && arr[2][1] == 'O')
					|| (arr[0][2] == 'O' && arr[1][2] == 'O' && arr[2][2] == 'O')
					|| (arr[0][2] == 'O' && arr[1][1] == 'O' && arr[2][0] == 'O')
					|| (arr[1][0] == 'O' && arr[1][1] == 'O' && arr[1][2] == 'O')
					|| (arr[2][0] == 'O' && arr[2][1] == 'O' && arr[2][2] == 'O')) {
				System.out.println("Player 2 wins!");
				win = true;
				break;
			}
		}
	}
}