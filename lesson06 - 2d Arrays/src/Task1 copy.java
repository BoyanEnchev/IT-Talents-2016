import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] names = new String[3];
		
		for (int index = 0; index < names.length; index++) {
			names[index] = sc.nextLine();
		}

		for (int index = 0; index < names.length; index++) {
			System.out.println(names[index]);
		}
	}

}
