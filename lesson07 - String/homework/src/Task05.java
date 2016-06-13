import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String vertical = sc.nextLine();
		String horizontal = sc.nextLine();
		int indexH = -1, indexV = -1;
		
		for (int index1 = 0; index1 < vertical.length(); index1++) {
			for (int index2 = 0; index2 < horizontal.length(); index2++) {
				if(vertical.charAt(index1) == horizontal.charAt(index2)){
					indexH = index1;
					indexV = index2;
				}
			}
			if(indexV != -1){
				break;
			}
		}
		
		if(indexV == -1){
			System.out.println("Nqma ednakvi bukvi.");
		}
		else{
			for (int index1 = 0; index1 < vertical.length(); index1++) {
				if(index1 == indexH){
					System.out.print(horizontal);
				}
				else{
					for (int indexSpace = 0; indexSpace < indexV; indexSpace++) {
						System.out.print(" ");
					}
					System.out.print(vertical.charAt(index1));
				}
				System.out.println();
			}
		}
	}

}
