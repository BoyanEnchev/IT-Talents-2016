import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String text1 = sc.nextLine();
		String text2 = sc.nextLine();
		
		int index = 0;
		
		while (index < text1.length() || index < text2.length()) {
			if (text1.charAt(index) != text2.charAt(index)) {
				System.out.println(index + " " + text1.charAt(index) + "-" + text2.charAt(index));
			}
			index++;
		}
		
		
	}
}
