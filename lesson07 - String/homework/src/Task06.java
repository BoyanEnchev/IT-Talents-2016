import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String text = sc.nextLine();

		String[] words = text.split(" ");

		for (int index = 0; index < words.length; index++) {
			words[index] = words[index].substring(0, 1).toUpperCase() 
											+ words[index].substring(1);
		}
		for (int index = 0; index < words.length; index++) {
			System.out.print(words[index] + " ");
		}
	}
}
